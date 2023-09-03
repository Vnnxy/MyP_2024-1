/**
 * Class that represents Korby default state.
 * @author equipo.
 */

public class DefaultKorby implements KorbyFood{

    /**
     * The method Korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "using a kick";
    }

    /**
     * The method korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using his arms";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Korby";
    }

    /**
     * @return the state korby is
     */
    public String getState() {
        return "Korby";
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
