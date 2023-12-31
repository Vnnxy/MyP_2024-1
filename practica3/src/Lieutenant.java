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
    private double dps;
    /* The speed points of the lieutenant. */
    private double speed;
    /* The defense points of the lieutenant. */
    private double defense;
    /* The gear the soldier will be using. */
    private String gear;
    /* The list of privates under the lieutenant. */
    private ArrayList<Soldier> privates;

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
        speed = 1;
        gear = "";
        privates = new ArrayList<>();
    }

    /**
     * Method that returns the lieutenant´s battle formation.
     * 
     * @return String the formation
     */
    public String getFormation() {
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
     * Method that returns the lieutenant´s speed.
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
     * Method that returns the lieutenant´s defense points.
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
     * Method that checks if the soldier is a captain.
     *
     * @return true if the soldier is a captain, false otherwise.
     */
    public boolean isCaptain() {
        return false;
    }

    /**
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    public boolean isLieutenant() {
        return true;
    }

    /**
     * Method that sets if the soldier is a captain.
     *
     * @param boolean  true if the soldier is a captain, false otherwise.
     */
    public void setIsCaptain(boolean isCaptain){
	if (isCaptain){
	    System.out.println("Im just a lieutenant");
	}
    }

    /**
     * Method that sets if the soldier is a lieutenant.
     *
     * @param boolean true if the soldier is a lieutenant, false otherwise.
     */
    public void setIsLieutenant(boolean isLieutenant){
	if(!isLieutenant){
	    System.out.println("Im going to stay as a lieutenant forever");
	} else{
	    System.out.println("Im already aLieutenant");
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
     * Method to relay an order to the battalion under the lieutenant.
     *
     */
    public void relayOrder(String order) {
        for (Soldier privateSoldier : privates)
            privateSoldier.receiveOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
	if (soldier.isCaptain() || soldier.isLieutenant()){
	    System.out.println("A Lieutenat only has Privates under control");
	    return;
	}
        privates.add(soldier);
    }

    /**
     * Method to give a report of the battalion.
     */
    public void report() {
        System.out.println(this.toString());
        for (Soldier privateSoldier : privates)
            privateSoldier.report();
    }

    /**
     * Method to receive an order.
     *
     */
    public void receiveOrder(String order) {
        this.formation = order;
	relayOrder(order);
    }

    /**
     * Method that returns the lieutenant´s full report.
     * 
     * @return String
     */
    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("\n\tLieutenant: " + id);
        information.append("\n\tBattalion formation: ").append(formation);
        information.append("\n\tDamage: ").append(dps);
        information.append("\n\tDefense: ").append(defense);
        information.append("\n\tSpeed: ").append(speed);
        information.append("\n\tGear: ").append(gear);
        return information.toString();
    }

}
