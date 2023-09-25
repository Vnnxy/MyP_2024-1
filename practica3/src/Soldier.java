/**
 * Interface that represents a soldier, a member of the army.
 * 
 * @author equipo.
 */
public interface Soldier {

    /**
     * Method that returns the soldier´s battle formation.
     * 
     * @return String the formation
     */
    public String getFormation();

    /**
     * Method that returns the soldier´s id.
     * 
     * @return String the id.
     */
    public String getId();

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    public int getDp();

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param int dp representing damage points
     */
    public void setDp(int dp);

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed();

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param int speed representing speed points
     */
    public void setSpeed(int speed);

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    public int getDefense();

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param int defense representing defense points
     */
    public void setDefense(int defense);

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param gear representing gear.
     */
    public void setGear(String gear);

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    public String getGear();

    /**
     * Method that checks if the soldier is a captain.
     *
     * @return true if the soldier is a captain, false otherwise.
     */
    public boolean isCaptain();

    /**
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    public boolean isLieutenant();

    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    public boolean hasIronCheemsBeenUsed();

    /**
     * Method to give a report of the battalion.
     *
     */
    public void report();

    /**
     * Method to relay an order to the battalion under the lieutenant.
     * @param oder the order
     */
    public void relayOrder(String order);

    /**
     * Method to receive an order from the lieutenant.
     * @param order the orde
     */
    public void receiveOrder(String order);

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier);

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    public String toString();

}
