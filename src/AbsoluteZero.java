/**
 * Class that represents MeganMan default state.
 * @author equipo.
 */

public class AbsoluteZero implements MeganManTransformation {

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "using Crimson End";
    }

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using Calamitous Arts";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Meelda Key";
    }

    /**
     * @return the state meganman is
     */
    public String getState() {
        return "AbsolutZero";
    }

    /**
     * @return the new health of meganman
     */
    public int getBonusHealth() {
        return 0;
    }

    /**
     * @return the new defense of meganman
     */
    public int getBonusDefense() {
        return 0;
    }

    /**
     * @return the new damage of meganman
     */
    public int getBonusDamage() {
        return 90;
    }
}
