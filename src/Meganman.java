import java.util.ArrayList;

/**
 * Class representing the fighter "Meganman" that
 * the players will be able to choose from. Extends @link Fighter.
 */
public class Meganman extends Fighter {

    /* Meganman's health points */
    private int hP = 700;
    /* Meganman's defense */
    private int defense = 40;
    /* Meganman's damage points */
    private int dP = 32;
    /* Meganman's current state */
    private MeganManTransformation state;
    /* Meganman's observers */
    private ArrayList<Observer> observers;

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     */
    public void attack(Fighter fighter) {
    }

    /**
     * The method meganman will be using to defend from others. It will reduce the
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
     * A getter for meganman's health.
     * 
     * @return The hP left from the fighter.
     */
    public int getHealth() {
        return hP;
    }

    /**
     * A getter for meganman's defense.
     * 
     * @return The current defense of the fighter.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * A getter for meganman's damage.
     * 
     * @return The current dP of the fighter.
     */
    public int getDamage() {
        return dP;
    }

    /**
     * The method meganman will be using when transforming. It gives him some perks.
     * 
     * @param robot the robot that meganman will be tranforming.
     */
    public void transform(MeganManTransformation robot) {

    }
}
