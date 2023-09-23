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
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    @Override
    public int getDp() {
        return soldier.getDp() - 2;
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() + 5;
    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return soldier.toString() + " using Turbine ";
    }

}
