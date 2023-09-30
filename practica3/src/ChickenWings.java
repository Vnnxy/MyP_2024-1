/**
 * Class that represents the Chicken Wings
 * 
 * @author equipo.
 */
public class ChickenWings extends Gear {

    /**
     * Builds a Chicken Wings decorator
     * 
     * @param soldier the soldier
     */
    public ChickenWings(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() +2);
	this.soldier.setDefense(soldier.getDefense() -1);
	this.soldier.setGear(soldier.getGear() + "Chicken wings, ");
    }
}
