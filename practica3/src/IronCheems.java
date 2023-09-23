/**
 * Class that represents the Iron Cheems
 * 
 * @author equipo.
 */
public class IronCheems extends Gear {

    /**
     * Builds an Iron Cheems decorator
     * 
     * @param soldier the soldier
     */
    public IronCheems(Soldier soldier) {
        super(soldier);
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() + 2;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    @Override
    public int getDefense() {
        return soldier.getDefense() + 2;
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
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return soldier.toString() + " using Iron Cheems";
    }

}
