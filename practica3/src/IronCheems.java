/**
 * Class that represents the Iron Cheems
 * 
 * @author equipo.
 */
public class IronCheems extends Gear {

    /**
     * Builds an Iron Cheems decorator
     * 
     * @param soldier the soldier
     */
    public IronCheems(Soldier soldier) {
        super(soldier);
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    @Override
    public int getSpeed() {
        return soldier.getSpeed() + 2;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    @Override
    public int getDefense() {
        return soldier.getDefense() + 2;
    }

    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    @Override
    public boolean hasIronCheemsBeenUsed() {
        return true;
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    @Override
    public int getDp() {
        return soldier.getDp() + 2;
    }

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param int speed representing speed points
     */
    public void setSpeed(int speed) {
        this.soldier.setSpeed(speed);
    }

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param int dp representing damage points
     */
    public void setDp(int dp) {
        this.soldier.setDp(dp);
    }

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param int defense representing defense points
     */
    public void setDefense(int defense) {
        this.soldier.setDefense(defense);
    }

    /**
     * Method to relay an order to the battalion
     *
     */
    public void relayOrder(String order) {
        this.soldier.relayOrder(order);
    }

    /**
     * Method for adding soldiers.
     *
     * @param soldier the soldier to add.
     */
    public void addSoldier(Soldier soldier) {
        this.soldier.addSoldier(soldier);
    }

    /**
     * Method to receive an order from the soldier.
     *
     */
    public void receiveOrder(String order) {
        this.soldier.receiveOrder(order);
    }

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param gear representing gear.
     */
    public void setGear(String gear) {
        this.soldier.setGear(soldier.getGear() + "using Iron Cheems");
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    public String getGear() {
        return soldier.getGear();
    }

}
