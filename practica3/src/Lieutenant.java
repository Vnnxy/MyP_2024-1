import java.util.ArrayList;

/**
 * Class that represents the lieutenant of the battalion.
 *
 * @author equipo.
 */
public class Lieutenant implements Soldier {

    /* The id of the lieutenant */
    private String id;
    /* The formation of the battalion. */
    private String formation;
    /* The damage points of the lieutenant. */
    private int dps;
    /* The speed points of the lieutenant. */
    private int speed;
    /* The defense points of the lieutenant. */
    private int defense;
    /* The gear the soldier will be using. */
    private String gear;
    /* The list of privates under the lieutenant. */
    private ArrayList<Private> privates;

    /**
     * Build a new lieutenant
     *
     * @param id the id of the lieutenant.
     */
    public Lieutenant(String id) {
        this.id = "Lieutenant " + id;
        formation = "default";
        dps = 1;
        defense = 1;
        speed = 1;
        gear = "";
        privates = new ArrayList<>();
    }

    /**
     * Method that returns the lieutenant´s battle formation.
     * 
     * @return String the formation
     */
    public String checkUp() {
        return formation;
    }

    /**
     * Method that returns the lieutenant´s id.
     * 
     * @return String the id.
     */
    public String getId() {
        return id;
    }

    /**
     * Method that returns the lieutenant´s damage points.
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
     * Method that returns the lieutenant´s speed.
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
     * Method that returns the lieutenant´s defense points.
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
     * @param gear representing gear.
     */
    public void setGear(String gear) {
        this.gear = gear;
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    public String getGear() {
        return gear;
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
     * Method to relay an order to the battalion under the lieutenant.
     *
     */
    public void relayOrder(String order) {
        this.formation = order;
        for (Private privateSoldier : privates)
            privateSoldier.receiveOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
        privates.add((Private) soldier);
    }

    /**
     * Method to give a report of the battalion.
     */
    public void report() {
        System.out.println(this.toString());
        for (Private privateSoldier : privates)
            privateSoldier.report();
    }

    /**
     * Method to receive an order (This wont be used for the captain).
     *
     */
    public void receiveOrder(String order) {
        return;
    }

    /**
     * Method that returns the lieutenant´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("\n\t" + id);
        information.append("\n\tBattalion formation ").append(formation);
        information.append("\n\tDamage ").append(dps);
        information.append("\n\tDefense ").append(defense);
        information.append("\n\tSpeed ").append(speed);
        information.append("\n\tGear ").append(gear);
        return information.toString();
    }

}
