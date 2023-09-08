/**
 * An abstract class representing the character/ fighters that
 * the players will be able to choose from. Each fighter
 * will posess unique traits and specifications.
 *
 * @author equipo.
 */
public abstract class Fighter {

    /* The fighter's health points */
    protected int hP;
    /* The fighter's defenseMode */
    protected boolean defenseMode;
    /* The fighter´s defense points*/
    protected int defense;
    /* The fighter's damage points */
    protected int dP;

    /**
     * The method fighters will be using to attack others. Registers and reduces
     * health.
     * 
     * @param fighter the fighter that'll be attacked, thus receiving damage.
     * @return The attack made.
     */
    public abstract String attack(Fighter fighter);

    /**
     * The method fighters will be using to defend from others. It will reduce the
     * damage taken.
     *
     * @return The defense made.
     */
    public abstract String defend();

    /**
     * A getter for the fighter's health.
     * 
     * @return The hP left from the fighter.
     */
    public int getHealth() {
        return hP;
    }

    /**
     * Indicates wheter the fighter is in defense mode.
     * 
     * @return The current defense of the fighter.
     */
    public boolean isDefense() {
        return defenseMode;
    }

    /**
     * Stops the defending mode
     */
    public void stopDefense() {
	this.defenseMode = false;
    }

    /**
     * A getter for the fighter's damage.
     * 
     * @return The current dP of the fighter.
     */
    public int getDamage() {
        return dP;
    }

    /**
     * reduce hP.
     *
     * @param The damage received 
     */
    public void receivedDamage(int damage) {
        if (isDefense())
	    damage = damage-defense;
	this.hP = hP-damage;
    }

    /**
     * Tells wheter the fighter is alive.
     *
     * @return Wheter the fighter is alive or not 
     */
    public boolean isAlive() {
        return hP > 0 ? true : false;
    }

    
}
