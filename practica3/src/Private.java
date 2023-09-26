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
    /* The gear the soldier will be using. */
    private String gear;

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
        gear = "";
    }

    /**
     * Method that returns the soldier´s battle formation.
     * 
     * @return String the formation
     */
    public String getFormation() {
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
     * Method that sets the soldier´s damage points.
     * 
     * @param int dp representing damage points
     */
    public void setDp(int dp) {
        this.dps = dp;
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
     * Method that sets the soldier´s speed points.
     * 
     * @param int speed representing speed points
     */
    public void setSpeed(int speed) {
        this.speed = speed;
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
        return false;
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
	System.out.println("Im just a Private");
    }

    /**
     * Method that sets if the soldier is a lieutenant.
     *
     * @param boolean true if the soldier is a lieutenant, false otherwise.
     */
    public void setIsLieutenant(boolean isLieutenant){
	System.out.println("Im just a Private");
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
	System.out.println("A private can't order anything");
        return;
    }

    /**
     * Method for adding soldiers, it won't be used
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
	System.out.println("A Private does not have any soldiers");
        return;
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
        information.append("\n\t\tPrivate: " + id);
        information.append("\n\t\tBattalion formation: ").append(formation);
        information.append("\n\t\tDamage: ").append(dps);
        information.append("\n\t\tDefense: ").append(defense);
        information.append("\n\t\tSpeed: ").append(speed);
        information.append("\n\t\tGear: ").append(gear);
        return information.toString();
    }

}
