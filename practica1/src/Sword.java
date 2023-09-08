/**
 * Class that represents Korby after eating a sword.
 * @author equipo.
 */

public class Sword implements KorbyFood{

    /**
     * The method Korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "using Lonk's sword";
    }

    /**
     * The method korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using tetraforce shield";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Sword";
    }

    /**
     * @return the state korby is
     */
    public String getState() {
        return "KorbyLonk";
    }

    /**
     * @return the new health of korby
     */
    public int getBonusHealth() {
        return 12;
    }

    /**
     * @return the new defense of korby
     */
    public int getBonusDefense() {
        return 8;
    }

    /**
     * @return the new damage of korby
     */
    public int getBonusDamage() {
        return 25;
    }
}
