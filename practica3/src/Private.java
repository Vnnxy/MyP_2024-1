/**
 * Class that represents the Privates of the batallion
 *
 * @author equipo.
 */

public class Private implements Soldier {

    /* The id of the private */
    private String id;
    /* The formation of the battalion. */
    private String formation;
    /* The damage points of the private. */
    private int dps;
    /* The speed points of the private. */
    private int speed;
    /* The defense points of the private. */
    private int defense;

    /**
     * Build a new private
     *
     * @param id the id of the private.
     */
    public Private(String id) {
        this.id = id;
        formation = "default";
        dps = 1;
        defense = 1;
	speed = 1;
    }

    /**
     * Method that returns the soldier´s battle formation.
     * 
     * @return String the formation
     */
    public String checkUp() {
        return formation;
    }

    /**
     * Method that returns the soldier´s id.
     * 
     * @return String the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    public int getDp() {
        return dps;
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    public boolean isCaptain() {
        return false;
    }

    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    public boolean hasIronCheemsBeenUsed() {
        return false;
    }

    /**
     * Method to receive an order from the lieutenant.
     *
     */
    public void receiveOrder(String order) {
        this.formation = order;
    }

    /**
     * Method to give a report of the private.
     */
    public void report() {
        System.out.println(this.toString());
    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    public String toString() {
	StringBuffer information = new StringBuffer();
        information.append("Private ").append(id);
        information.append("\nBattalion formation ").append(formation);
        information.append("\nDamage ").append(dps);
	information.append("\nDefense ").append(defense);
        information.append("\nSpeed ").append(speed);
        return information.toString();
    }
    /**
     * Method that returns the description.
     * 
     * @return String
     */
    public String getDescription(){
	return "Private";
    }

}