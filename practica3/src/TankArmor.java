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
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() - 5;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    @Override
    public int getDefense() {
        return soldier.getDefense() + 5;
    }

    /**
     * Method that returns the description.
     * 
     * @return String
     */
    @Override
    public String getDescription(){
	return " using Tank Armor  ";
    }

}
