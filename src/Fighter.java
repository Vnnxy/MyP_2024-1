/**
 * An abstract class representing the character/ fighters that
 * the players will be able to choose from. Each fighter
 * will posess unique traits and specifications.
 */
public abstract class Fighter {

    private int hP;
    private int defense;
    private int dP;

    /**
     * The method fighters will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     */
    public void attack(Fighter fighter) {
    }

    /**
     * The method fighters will be using to defend from others. It will reduce the
     * damage taken.
     */
    public void defend() {
    }

    /**
     * Method for resetting to the default behaviour.
     */
    public void defaultt() {
    }

    /**
     * A getter for the fighter's health.
     * 
     * @return The hP left from the fighter.
     */
    public int getHealth() {
        return hP;
    }

    /**
     * A getter for the fighter's defense.
     * 
     * @return The current defense of the fighter.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * A getter for the fighter's damage.
     * 
     * @return The current dP of the fighter.
     */
    public int getDamage() {
        return dP;
    }

}