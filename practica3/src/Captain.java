import java.util.ArrayList;

/**
 * Class that represents the captain of the battalion.
 *
 * @author equipo.
 */
public class Captain implements Soldier {

    /* The id of the captain */
    private String id;
    /* The formation of the battalion. */
    private String formation;
    /* The damage points of the captain. */
    private int dps;
    /* The speed points of the captain. */
    private int speed;
    /* The defense points of the captain. */
    private int defense;
    /* The list of lieutenants under the captain. */
    private ArrayList<Lieutenant> lieutenants;
    /* The gear the soldier will be using. */
    private String gear;

    /**
     * Build a new captain
     *
     * @param id the id of the captain.
     */
    public Captain(String id) {
        this.id = id;
        formation = "default";
        dps = 1;
        defense = 1;
        speed = 1;
        lieutenants = new ArrayList<>();
    }

    /**
     * Method that returns the captain´s battle formation.
     * 
     * @return String the formation
     */
    public String checkUp() {
        return formation;
    }

    /**
     * Method that returns the captain´s id.
     * 
     * @return String the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Method that returns the captain´s damage points.
     * 
     * @return int damage points
     */
    public int getDp() {
        return dps;
    }

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param int dp representing damage points
     */
    public void setDp(int dp) {
        this.dps = dp;
    }

    /**
     * Method that returns the captain´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param int speed representing speed points
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Method that returns the captain´s defense points.
     * 
     * @return int defense points
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param int defense representing defense points
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param String representing gear.
     */
    public void setGear(String gear) {
        // Im not sure what goes here
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    public String getGear() {
        return gear;
    }

    /**
     * Method that checks if the soldier is a captain.
     *
     * @return true if the soldier is a captain, false otherwise.
     */
    public boolean isCaptain() {
        return true;
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
     * Method to relay an order to the battalion under the captain.
     *
     */
    public void relayOrder(String order) {
        this.formation = order;
        for (Lieutenant lieutenant : lieutenants)
            lieutenant.relayOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the captain.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
        lieutenants.add((Lieutenant) soldier);
    }

    /**
     * Method to give a report of the battalion.
     */
    public void report() {
        System.out.println(this.toString());
        for (Soldier soldier : lieutenants)
            soldier.report();
    }

    /**
     * Method to receive an order (This wont be used for the captain).
     *
     */
    public void receiveOrder(String order) {
        return;
    }

    /**
     * Method that returns the captain´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("Captain ").append(id);
        information.append("\nBattalion formation ").append(formation);
        information.append("\nDamage ").append(dps);
        information.append("\nDefense ").append(defense);
        information.append("\nSpeed ").append(speed);
        return information.toString();
    }

}
