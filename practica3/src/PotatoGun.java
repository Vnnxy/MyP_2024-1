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
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    @Override
    public int getDefense() {
        return soldier.getDefense() - 1;
    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return soldier.toString() + " using Potato Gun";
    }

}
