/**
 * Class that represents the tank armor
 * 
 * @author equipo.
 */
public class TankArmor extends Gear {

    /**
     * Builds a tank armor decorator
     * 
     * @param soldier the soldier
     */
    public TankArmor(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() -5);
	this.soldier.setDefense(soldier.getDefense() +5);
	this.soldier.setGear(soldier.getGear() + "Tank Armor, ");
    }
}
