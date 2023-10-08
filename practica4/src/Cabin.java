/**
 * Abstract class for the Cabin we will be using.
 * Implements the Components interface
 * 
 * @author equipo.
 */
public abstract class Cabin implements Components {

    /**
     * Defense getter.
     * 
     * @return double the speed of the cabin.
     */
    public double getDefense() {
        return 0;
    }

    /**
     * Attack getter.
     * 
     * @return double the attack of the cabin.
     */
    public double getAttack() {
        return 0;
    }

    /**
     * ToString.
     * 
     * @return String the string representation of the cabin.
     */
    public String toString() {
        return "Ship's company: " + getName();
    }

}
