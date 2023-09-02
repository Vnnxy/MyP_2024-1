public class JetMan implements MeganManTransformation {

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @return the attack made
     */
    public String attack() {
        return "Using jet stream on";
    }

    /**
     * The method meganman will be using to defend from others.
     * 
     * @return the defense made
     */
    public String defend() {
        return "Using the rotors to deflect";
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
        return "";
    }

    /**
     * @return the new health of meganman
     */
    public int getBonusHealth() {
        return 150;
    }

    /**
     * @return the new defense of meganman
     */
    public int getBonusDefense() {
        return 15;
    }

    /**
     * T@return the new damage of meganman
     */
    public int getBonusDamage() {
        return 20;
    }

}
