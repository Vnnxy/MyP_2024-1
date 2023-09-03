
/**
 * Class representing the fighter "Meganman" that
 * the players will be able to choose from. Extends @link Fighter.
 *
 * @author equipo.
 */
public class MeganMan extends Fighter {

    /* Meganman's current state */
    private MeganManTransformation state;

    /**
     * Builds a new MeganMan
     */
    public MeganMan() {
        this.hP = 100;
        this.defenseMode = false;
        this.defense = 4;
        this.dP = 15;
        this.state = new DefaultMeganMan();
    }

    /**
     * The method meganman will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     * @return The attack made.
     */
    public String attack(Fighter fighter) {
        String attack = state.attack();
        fighter.receivedDamage(this.dP);
        return "MeganMan attacked " + fighter.toString() + " " + attack;
    }

    /**
     * The method meganman will be using to defend from others. It will reduce the
     * damage taken.
     */
    public String defend() {
        String defend = state.defend();
        this.defenseMode = true;
        return "MeganMan defends " + defend;
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
     * The method meganman will be using when transforming. It gives him some perks.
     * 
     * @param robot the robot that meganman will be tranforming.
     */
    public String transform(MeganManTransformation robot) {
        this.state = robot;
        this.hP = hP + state.getBonusHealth();
        this.defense = defense + state.getBonusDefense();
        this.dP = dP + state.getBonusDamage();
        return "MegaMan has transform to " + state.toString() + "and became " + state.getState();
    }

    public String toString() {
        return state.getState();
    }
}
