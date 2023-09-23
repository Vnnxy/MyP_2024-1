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
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() + 3;
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
	return " using Giant Frog Legs ";
    }

}
