/**
 * Class that represents MeganMan´s transformation to DiamondIce.
 * @author equipo.
 */

public class DiamondIce implements MeganManTransformation {

     /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modified attack made
     */
    public String attack() {
        return "using Satellite Ice";
    }

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using ice wall";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Diamond Ice";
    }

    /**
     * @return the state meganman is
     */
    public String getState() {
        return "MeganIceDiamond";
    }

    /**
     * @return the new health of meganman
     */
    public int getBonusHealth() {
        return 20;
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
        return 15;
    }
}
