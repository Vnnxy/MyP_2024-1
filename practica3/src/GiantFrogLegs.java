/**
 * Class that represents the GiantFrogLegs Gear
 * 
 * @author equipo.
 */
public class GiantFrogLegs extends Gear {

    /**
     * Builds a Giant Frog Legs decorator
     * 
     * @param soldier the soldier
     */
    public GiantFrogLegs(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() +3);
	this.soldier.setDefense(soldier.getDefense() -1);
	this.soldier.setGear(soldier.getGear() + "Giant frog legs, ");
    }
}
