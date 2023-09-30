/**
 * Class that represents the Potato Gun
 * 
 * @author equipo.
 */
public class PotatoGun extends Gear {

    /**
     * Builds a Potato Gun decorator
     * 
     * @param soldier the soldier
     */
    public PotatoGun(Soldier soldier) {
        super(soldier);
	this.soldier.setDp(soldier.getDp() +2);
	this.soldier.setDefense(soldier.getDefense() -1);
	this.soldier.setGear(soldier.getGear() + "Potato gun, ");
    }
}
