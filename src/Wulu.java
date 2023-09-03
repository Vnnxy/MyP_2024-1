/**
 * Class that represents Dittus´s transformation to Wulu.
 * @author equipo.
 */

public class Wulu implements DittuuTransformation {

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "using double-edge";
    }

    /**
     * The method Dittuu will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using defense curl to increase defense";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Wulu";
    }

    /**
     * @return the state dittuu is
     */
    public String getState() {
        return "Wuluittu";
    }

    /**
     * @return the new health of dittuu
     */
    public int getBonusHealth() {
        return 60;
    }

    /**
     * @return the new defense of dittuu
     */
    public int getBonusDefense() {
        return 50;
    }

    /**
     * @return the new damage of dittuu
     */
    public int getBonusDamage() {
        return 30;
    }

}
