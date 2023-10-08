/**
 * Public interface for our spaceship components.
 * 
 * @author equipo.
 */
public interface Components {

    /**
     * Credit getter.
     * 
     * @return double the credit of the ship.
     */
    public double getCredit();

    /**
     * Speed getter.
     * 
     * @return double the speed of the ship.
     */
    public double getSpeed();

    /**
     * Defense getter.
     * 
     * @return double the speed of the ship.
     */
    public double getDefense();

    /**
     * Weight getter.
     * 
     * @return double the weight of the ship.
     */
    public double getWeight();

    /**
     * Attack getter.
     * 
     * @return double the attack of the ship.
     */
    public double getAttack();

    /**
     * Name getter.
     * 
     * @return String the name of the component ship.
     */
    public String getName();

    /**
     * ToString.
     * 
     * @return String the string representation of the comnponent.
     */
    public String toString();
}
