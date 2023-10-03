/**
 * Abstract class for the Armor we will be using.
 * Implements the Components interface
 * 
 * @author equipo.
 */
public abstract class Armor implements Components {

    /**
     * Attack getter.
     * 
     * @return double the attack of the armor.
     */
    public double getAttack() {
        return 0;
    }

    /**
     * ToString.
     * 
     * @return String the string representation of the armor.
     */
    public String toString() {
        return "Armor and shields type: " + getName();
    }
}
