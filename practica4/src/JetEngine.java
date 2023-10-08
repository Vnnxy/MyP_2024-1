/**
 * Abstract class for the Cabin we will be using.
 * Implements the Components interface
 * 
 * @author equipo.
 */
public abstract class JetEngine implements Components {

    /**
     * Defense getter.
     * 
     * @return double the speed of the Engine.
     */
    public double getDefense() {
        return 0;
    }

    /**
     * Attack getter.
     * 
     * @return double the attack of the Engine.
     */
    public double getAttack() {
        return 0;
    }

    /**
     * ToString.
     * 
     * @return String the string representation of the Engine.
     */
    public String toString() {
        return "Jet Engine: " + getName();
    }

}
