/**
 * Class that represents Dittus´s transformation to Miu.
 * @author equipo.
 */

public class Miu implements DittuuTransformation {

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the modfied attack made
     */
    public String attack() {
        return "using aura sphere";
    }

    /**
     * The method Dittuu will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "using imprison to prevent attack";
    }

    /**
     * @return The string representation of the transformation.
     */
    public String toString() {
        return "Miu";
    }

    /**
     * @return the state dittuu is
     */
    public String getState() {
        return "Miudittu";
    }

    /**
     * @return the new health of dittuu
     */
    public int getBonusHealth() {
        return 70;
    }

    /**
     * @return the new defense of dittuu
     */
    public int getBonusDefense() {
        return 60;
    }

    /**
     * @return the new damage of dittuu
     */
    public int getBonusDamage() {
        return 70;
    }

}
