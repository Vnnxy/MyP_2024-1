/**
 * Class that represents Dittus´s transformation to Espion.
 * @author equipo.
 */

public class Espion implements DittuuTransformation {

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "using psybeam";
    }

    /**
     * The method Dittuu will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using charm to evade";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Espion";
    }

    /**
     * @return the state dittuu is
     */
    public String getState() {
        return "DittuEspion";
    }

    /**
     * @return the new health of dittuu
     */
    public int getBonusHealth() {
        return 50;
    }

    /**
     * @return the new defense of dittuu
     */
    public int getBonusDefense() {
        return 40;
    }

    /**
     * @return the new damage of dittuu
     */
    public int getBonusDamage() {
        return 60;
    }

}
