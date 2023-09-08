/**
 * Class that represents Dittuu default state.
 * @author equipo.
 */

public class DefaultDittuu implements DittuuTransformation {

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "but he cant attack";
    }

    /**
     * The method korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "but he cannot defend himself";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Dittuu";
    }

    /**
     * @return the state korby is
     */
    public String getState() {
        return "Dittuu";
    }

    /**
     * @return the new health of korby
     */
    public int getBonusHealth() {
        return 0;
    }

    /**
     * @return the new defense of korby
     */
    public int getBonusDefense() {
        return 0;
    }

    /**
     * @return the new damage of korby
     */
    public int getBonusDamage() {
        return 0;
    }
}
