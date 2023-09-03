/**
 * Class that represents Korby´s transformation to Jetman.
 * 
 * @author equipo.
 */

public class Cone implements KorbyFood {

    /**
     * The method Korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "slamming";
    }

    /**
     * The method Korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "rotating";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Cone";
    }

    /**
     * @return the state Korby is
     */
    public String getState() {
        return "KorbyCone";
    }

    /**
     * @return the new health of Korby
     */
    public int getBonusHealth() {
        return 10;
    }

    /**
     * @return the new defense of Korby
     */
    public int getBonusDefense() {
        return 0;
    }

    /**
     * @return the new damage of Korby
     */
    public int getBonusDamage() {
        return 20;
    }

}
