public interface MeganManTransformation {

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the attack made
     */
    public String attack();

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend();

    /**
     * @return The string representation of the transformation.
     */
    public String toString();

    /**
     * @return the state meganman is
     */
    public String getState();

    /**
     * @return the new health of meganman
     */
    public int getBonusHealth();

    /**
     * @return the new defense of meganman
     */
    public int getBonusDefense();

    /**
     * T@return the new damage of meganman
     */
    public int getBonusDamage();

}
