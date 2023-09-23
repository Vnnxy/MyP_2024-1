/**
 * Interface that represents a soldier, a member of the army.
 * 
 * @author equipo.
 */
public interface Soldier {

    /**
     * Method that returns the soldier´s battle formation.
     * @return String the formation
     */
    public String checkUp();

    /**
     * Method that returns the soldier´s id.
     * @return String the id.
     */
    public String getId();

    /**
     * Method that returns the soldier´s damage points.
     * @return int damage points
     */
    public int getDp();

    /**
     * Method that returns the soldier´s speed.
     * @return int speed.
     */
    public int getSpeed();

    /**
     * Method that returns the soldier´s defense points.
     * @return int defense points
     */
    public int getDefense();

    /**
     * Method that returns the soldier´s full report.
     * @return String 
     */
    public String toString();
    
}
