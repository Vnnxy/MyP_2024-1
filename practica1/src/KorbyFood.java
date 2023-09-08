/**
 * Interface that states the methods use for any Korby Food.
 * @author equipo.
 */

public interface KorbyFood {

    /**
     * The method Korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the attack made
     */
    public String attack();

    /**
     * The method Korby will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend();

    /**
     * @return The string representation of the transformation.
     */
    public String toString();

    /**
     * @return the state korby is
     */
    public String getState();

    /**
     * @return the new health of Korby
     */
    public int getBonusHealth();

    /**
     * @return the new defense of Korby
     */
    public int getBonusDefense();

    /**
     * @return the new damage of Korby
     */
    public int getBonusDamage();

}
