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
        return soldier.getDefense() - 1;
    }

    /**
     * Method that returns the description.
     * 
     * @return String
     */
    @Override
    public String getDescription(){
	return " using Chicken Wings ";
    }

}
