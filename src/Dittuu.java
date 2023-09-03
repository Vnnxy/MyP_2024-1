
/**
 * Class representing the fighter "Dittuu" that
 * the players will be able to choose from. Extends @link Fighter.
 *
 * @author equipo.
 */
public class Dittuu extends Fighter {

    /* Dittus's current state */
    private DittuuTransformation state;

    /**
     *Builds a new Dittuu
     */
    public Dittuu(){
	this.hP = 100;
	this.defenseMode = false;
	this.defense = 0;
	this.dP = 0;
	this.state = new DefaultDittuu();
    } 

    /**
     * The method Dittuu will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     * @return The attack made.
     */
    public String attack(Fighter fighter) {
	String attack = state.attack();
	fighter.receivedDamage(this.dP);
	return "Dittuu attacked "+ fighter.toString() + " " + attack;
    }

    /**
     * The method Dittuu will be using to defend from others. It will reduce the
     * damage taken.
     */
    public String defend() {
	String defend = state.defend();
	this.defenseMode = true;
	return "Dittuu defends" + defend;
    }

    /**
     * A getter for Dittuu's defense.
     * 
     * @return The current defense of the fighter.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * The method Dittuu will be using when transforming to another
     * chinpokomon. It gives him some perks.
     * @param chinpokomon the chinpokomon that Dittuu will transform to.
     */
    public String transform(DittuuTransformation chinpokomon) {
	this.state = chinpokomon;
	this.hP = hP + state.getBonusHealth();
	this.defense = defense + state.getBonusDefense();
	this.dP = dP + state.getBonusDamage();
	return "Dittuu has transformed to " + state.toString() + " and became " +state.getState();
    }

    public String toString(){
	return state.getState();
    }
}
