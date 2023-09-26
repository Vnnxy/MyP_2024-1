/**
 * Abstract class that represents soldier's gear
 * 
 * @author equipo.
 */
public abstract class Gear implements Soldier {

    /* The soldier */
    protected Soldier soldier;

    /**
     * Builds a new gear
     * 
     * @param soldier the soldier
     */
    public Gear(Soldier soldier) {
        this.soldier = soldier;
    }

    /**
     * Method that returns the soldier´s battle formation.
     * 
     * @return String the formation
     */
    public String getFormation() {
        return soldier.getFormation();
    }

    /**
     * Method that returns the soldier´s id.
     * 
     * @return String the id.
     */
    public String getId() {
        return soldier.getId();
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    public int getDp() {
        return soldier.getDp();
    }

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param int dp representing damage points
     */
    public void setDp(int dp){
	soldier.setDp(dp);
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return soldier.getSpeed();
    }

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param int speed representing speed points
     */
    public void setSpeed(int speed){
	soldier.setSpeed(speed);
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    public int getDefense() {
        return soldier.getDefense();
    }

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param int defense representing defense points
     */
    public void setDefense(int defense){
	soldier.setDefense(defense);
    }

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param gear representing gear.
     */
    public void setGear(String gear){
	soldier.setGear(gear);
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    public String getGear() {
        return soldier.getGear();
    }

    /**
     * Method that checks if the soldier is a captain.
     *
     * @return true if the soldier is a captain, false otherwise.
     */
    public boolean isCaptain() {
        return soldier.isCaptain();
    }

    /**
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    public boolean isLieutenant(){
	return soldier.isLieutenant();
    }

    /**
     * Method that sets if the soldier is a captain.
     *
     * @param boolean  true if the soldier is a captain, false otherwise.
     */
    public void setIsCaptain(boolean isCaptain){
	soldier.setIsCaptain(isCaptain);
    }

    /**
     * Method that sets if the soldier is a lieutenant.
     *
     * @param boolean true if the soldier is a lieutenant, false otherwise.
     */
    public void setIsLieutenant(boolean isLieutenant){
	soldier.setIsLieutenant(isLieutenant);
    }

    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    public boolean hasIronCheemsBeenUsed() {
        return soldier.hasIronCheemsBeenUsed();
    }

    /**
     * Method to give a report of the battalion.
     *
     */
    public void report() {
        soldier.report();
    }

    /**
     * Method to relay an order to the battalion under the lieutenant.
     * @param oder the order
     */
    public void relayOrder(String order){
	soldier.relayOrder(order);
    }

    /**
     * Method to receive an order from the lieutenant.
     * @param oder the order
     */
    public void receiveOrder(String order){
	soldier.receiveOrder(order);
    }

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier){
	this.soldier.addSoldier(soldier);
    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    public String toString() {
        return soldier.toString();
    }

}
