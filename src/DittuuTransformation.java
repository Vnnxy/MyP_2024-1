/**
 * Interface that states the methods use for any Dittuu transformation.
 * 
 * @author equipo.
 */

public interface DittuuTransformation {

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the attack made
     */
    public String attack();

    /**
     * The method Dittuu will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend();

    /**
     * @return The string representation of the transformation.
     */
    public String toString();

    /**
     * @return the state Dittuu is
     */
    public String getState();

    /**
     * @return the new health of Dittuu
     */
    public int getBonusHealth();

    /**
     * @return the new defense of Dittuu
     */
    public int getBonusDefense();

    /**
     * @return the new damage of Dittuu
     */
    public int getBonusDamage();

}
