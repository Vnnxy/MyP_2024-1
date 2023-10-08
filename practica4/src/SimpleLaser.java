/**
 * Class for the SimpleLaser Weapon..
 * 
 * @author equipo.
 */
public class SimpleLaser extends Weapons {

    /**
     * Credit getter.
     * 
     * @return double the credit of the weapon.
     */
    public double getCredit() {
        return 1000;
    }

    /**
     * Attack getter.
     * 
     * @return double the attack of the weapon.
     */
    public double getAttack() {
        return 100;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the weapon.
     */
    public double getWeight() {
        return 75;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the weapon.
     */
    public double getSpeed() {
        return -15;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component weapon.
     */
    public String getName() {
        return "Simple Laser";
    }
}
