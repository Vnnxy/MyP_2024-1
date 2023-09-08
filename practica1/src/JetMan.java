/**
 * Class that represents MeganMan´s transformation to Jetman.
 * @author equipo.
 */

public class JetMan implements MeganManTransformation {

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "using jet stream on";
    }

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using the rotors to deflect";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "JetMan";
    }

    /**
     * @return the state meganman is
     */
    public String getState() {
        return "MeganJetMan";
    }

    /**
     * @return the new health of meganman
     */
    public int getBonusHealth() {
        return 40;
    }

    /**
     * @return the new defense of meganman
     */
    public int getBonusDefense() {
        return 10;
    }

    /**
     * @return the new damage of meganman
     */
    public int getBonusDamage() {
        return 20;
    }

}
