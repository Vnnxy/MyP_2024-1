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
    public String checkUp() {
        return soldier.checkUp();
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
     * Method that returns the soldier´s speed.
     * 
     * @return int speed.
     */
    public int getSpeed() {
        return soldier.getSpeed();
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
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    public String toString() {
        return soldier.toString();
    }

}
