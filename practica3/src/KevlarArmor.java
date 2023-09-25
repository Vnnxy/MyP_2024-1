/**
 * Class that represents the Kevlar armor
 * 
 * @author equipo.
 */
public class KevlarArmor extends Gear {

    /**
     * Builds a kevlar armor decorator
     * 
     * @param soldier the soldier
     */
    public KevlarArmor(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() -1);
	this.soldier.setDefense(soldier.getDefense() +2);
	this.soldier.setGear(soldier.getGear() + "Kevlar Armor, ");
    }
}
