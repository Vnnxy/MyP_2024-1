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
    private double dps;
    /* The speed points of the captain. */
    private double speed;
    /* The defense points of the captain. */
    private double defense;
    /* The gear the soldier will be using. */
    private String gear;
    /* The list of lieutenants under the captain. */
    private ArrayList<Soldier> lieutenants;

    /**
     * Build a new captain
     *
     * @param id the id of the captain.
     * @param formation the formation
     */
    public Captain(String id, String formation) {
        this.id = id;
        this.formation = formation;
        dps = 1;
        defense = 1;
        speed = 1;
        gear = "";
        lieutenants = new ArrayList<>();
    }

    /**
     * Method that returns the captain´s battle formation.
     * 
     * @return String the formation
     */
    public String getFormation() {
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
     * @return double damage points
     */
    public double getDp() {
        return dps;
    }

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param double dp representing damage points
     */
    public void setDp(double dp) {
        this.dps = dp;
    }

    /**
     * Method that returns the captain´s speed.
     * 
     * @return double speed.
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param double speed representing speed points
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Method that returns the captain´s defense points.
     * 
     * @return double defense points
     */
    public double getDefense() {
        return defense;
    }

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param double defense representing defense points
     */
    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param String representing gear.
     */
    public void setGear(String gear) {
        this.gear = gear;
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * @return String the gear
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
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    public boolean isLieutenant() {
        return false;
    }

    /**
     * Method that sets if the soldier is a captain.
     *
     * @param boolean  true if the soldier is a captain, false otherwise.
     */
    public void setIsCaptain(boolean isCaptain){
	System.out.println("I'm already a Captain");
    }

    /**
     * Method that sets if the soldier is a lieutenant.
     *
     * @param boolean true if the soldier is a lieutenant, false otherwise.
     */
    public void setIsLieutenant(boolean isLieutenant){
	if (isLieutenant){
	    System.out.println("I'm a captain i'm not getting derank");
	}
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
        for (Soldier lieutenant : lieutenants)
            lieutenant.receiveOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the captain.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
	if (!soldier.isLieutenant()){
	    System.out.println("A captain can only receive lieutenants");
	    return;
	}
        lieutenants.add(soldier);
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
	System.out.println("A captain can't receive orders");
        return;
    }

    /**
     * Method that returns the captain´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("Captain: ").append(id);
        information.append("\nBattalion formation: ").append(formation);
        information.append("\nDamage: ").append(dps);
        information.append("\nDefense: ").append(defense);
        information.append("\nSpeed: ").append(speed);
        information.append("\nGear: ").append(gear);
        return information.toString();
    }

}
