/**
 * Class that represents Korby´s transformation to Jetman.
 * 
 * @author equipo.
 */

public class Car implements KorbyFood {

    /**
     * The method Korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "hitting the gas pedal onto";
    }

    /**
     * The method Korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "Drifting and evading";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Car";
    }

    /**
     * @return the state Korby is
     */
    public String getState() {
        return "KorbyCar";
    }

    /**
     * @return the new health of Korby
     */
    public int getBonusHealth() {
        return 5;
    }

    /**
     * @return the new defense of Korby
     */
    public int getBonusDefense() {
        return 15;
    }

    /**
     * @return the new damage of Korby
     */
    public int getBonusDamage() {
        return 28;
    }

}
