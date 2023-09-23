/**
 * Class that represents the Laser Beam
 * 
 * @author equipo.
 */
public class LaserBeam extends Gear {

    /**
     * Builds a Laser Beam decorator
     * 
     * @param soldier the soldier
     */
    public LaserBeam(Soldier soldier) {
        super(soldier);
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    @Override
    public int getDp() {
        return soldier.getDp() + 2;
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() - 1;
    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return soldier.toString() + " using Laser Beam";
    }

}
