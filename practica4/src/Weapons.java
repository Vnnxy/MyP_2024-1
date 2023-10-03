/**
 * Abstract class for the Weapons we will be using.
 * Implements the Components interface
 * 
 * @author equipo.
 */
public abstract class Weapons implements Components {

    /**
     * Defense getter.
     * 
     * @return double the speed of the ship.
     */
    public double getDefense() {
        return 0;
    }

    /**
     * ToString.
     * 
     * @return String the string representation of the weapon.
     */
    public String toString() {
        return "Weapon system: " + getName();
    }
}
