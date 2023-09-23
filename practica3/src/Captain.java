import java.util.ArrayList;

/**
 * Class that represents the captain of the battalion.
 *
 * @author equipo.
 */
public class Captain implements Soldier {

    /* The id of the captain */
    String id;
    /* The formation of the battalion. */
    String formation;
    /* The damage points of the captain. */
    int dps;
    /* The speed points of the captain. */
    int speed;
    /* The defense points of the captain. */
    int defense;
    /* The list of lieutenants under the captain. */
    ArrayList<Soldier> lieutenants;

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
     * Method that returns the captain´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return speed;
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
        return this instanceof IronCheems ? true : false;
    }

    /**
     * Method to relay an order to the battalion under the captain.
     *
     */
    public void relayOrder(String order) {
        this.formation = order;
        for (Soldier lieutenant : lieutenants)
            (Lieutenant)lieutenant.relayOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the captain.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
        lieutenants.add(soldier);
    }

    /**
     * Method to give a report of the battalion.
     */
    public void report() {
        this.toString();
        for (Soldier soldier : lieutenants)
            soldier.toString();
    }

    /**
     * Method that returns the captain´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("Captain " + id);
        information.append("\nBattalion formation " + formation);
        information.append("\nDamage " + dps);
        information.append("\nDefense " + defense);
        information.append("\nSpeed " + speed);
        information.append("\nGear: ");
        return information.toString();
    }
}
