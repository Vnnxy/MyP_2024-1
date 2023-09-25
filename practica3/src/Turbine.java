/**
 * Class that represents the Turbine
 * 
 * @author equipo.
 */
public class Turbine extends Gear {

    /**
     * Builds a Turbine decorator
     * 
     * @param soldier the soldier
     */
    public Turbine(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() +5);
	this.soldier.setDp(soldier.getDp() -2);
	this.soldier.setGear(soldier.getGear() + "Turbine, ");
    }
}
