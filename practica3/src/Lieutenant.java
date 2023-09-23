import java.util.ArrayList;

/**
 * Class that represents the lieutenant of the battalion.
 *
 * @author equipo.
 */
public class Lieutenant implements Soldier {

    /* The id of the lieutenant */
    String id;
    /* The formation of the battalion. */
    String formation;
    /* The damage points of the lieutenant. */
    int dps;
    /* The speed points of the lieutenant. */
    int speed;
    /* The defense points of the lieutenant. */
    int defense;
    /* The list of soldiers under the lieutenant. */
    ArrayList<Soldier> soldiers;

    /** 
     * Build a new lieutenant
     *
     * @param id the id of the lieutenant.
     */
    public Lieutenant(String id) {
        this.id = id;
        formation = "default";
        dps = 1;
        defense = 1;
        soldiers = new ArrayList<>();
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
     * Method that returns the lieutenant´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return speed;
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
        return this instanceof IronCheems ? true : false;
    }

    /**
     * Method to relay an order to the battalion under the lieutenant.
     *
     */
    public void relayOrder(String order) {
        this.formation = order;
        for (Soldier lieutenant : lieutenants)
            soldier.receiveOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    /**
     * Method to give a report of the battalion.
     */
    public void report() {
        this.toString();
        for (Soldier soldier : soldiers)
            soldier.toString();
    }

    /**
     * Method that returns the lieutenant´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("Lieutenant " + id);
        information.append("\nBattalion formation " + formation);
        information.append("\nDamage " + dps);
        information.append("\nDefense " + defense);
        information.append("\nSpeed " + speed);
        information.append("\nGear: ");
        return information.toString();
    }
}
