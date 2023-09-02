/**
 * Class representing the fighter "Meganman" that
 * the players will be able to choose from. Extends @link Fighter.
 */
public class Meganman extends Fighter {

    private int hP = 700;
    private int defense = 40;
    private int dP = 32;

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
        defense = 40;
        dP = 32;
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
