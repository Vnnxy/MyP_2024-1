
/**
 * Class representing the fighter "Korby" that
 * the players will be able to choose from. Extends @link Fighter.
 *
 * @author equipo.
 */
public class Korby extends Fighter {

    /* Korby's current state */
    private KorbyFood state;

    /**
     *Builds a new Korby
     */
    public Korby(){
	this.hP = 100;
	this.defenseMode = false;
	this.defense = 2;
	this.dP = 20;
	this.state = new DefaultKorby();
    } 

    /**
     * The method korby will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     * @return The attack made.
     */
    public String attack(Fighter fighter) {
	String attack = state.attack();
	fighter.receivedDamage(this.dP);
	return "Korby attacked "+ fighter.toString() + " " + attack;
    }

    /**
     * The method Korby will be using to defend from others. It will reduce the
     * damage taken.
     */
    public String defend() {
	String defend = state.defend();
	this.defenseMode = true;
	return "Korby defends" + defend;
    }

    /**
     * A getter for Korby's defense.
     * 
     * @return The current defense of the fighter.
     */
    public int getDefense() {
        return defense;
    }

    /**
     * The methodKorby will be using when transforming. It gives him some perks.
     * 
     * @param food the food that korby will absorb.
     */
    public String transform(KorbyFood food) {
	this.state = food;
	this.hP = hP + state.getBonusHealth();
	this.defense = defense + state.getBonusDefense();
	this.dP = dP + state.getBonusDamage();
	return "Korby has eaten a " + state.toString() + " and became " +state.getState();
    }

    public String toString(){
	return state.getState();
    }
}
