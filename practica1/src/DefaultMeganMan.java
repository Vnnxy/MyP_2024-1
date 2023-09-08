/**
 * Class that represents MeganMan default state.
 * @author equipo.
 */

public class DefaultMeganMan implements MeganManTransformation{

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "using proto strike";
    }

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using crouch";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "MeganMan";
    }

    /**
     * @return the state meganman is
     */
    public String getState() {
        return "MeganMan";
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
        return 0;
    }
}
