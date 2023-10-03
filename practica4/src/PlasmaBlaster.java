/**
 * Class for the Plasma Blaster Weapon..
 * 
 * @author equipo.
 */
public class PlasmaBlaster extends Weapons {

    /**
     * Credit getter.
     * 
     * @return double the credit of the weapon.
     */
    public double getCredit() {
        return 2000;
    }

    /**
     * Attack getter.
     * 
     * @return double the attack of the weapon.
     */
    public double getAttack() {
        return 200;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the weapon.
     */
    public double getWeight() {
        return 155;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the weapon.
     */
    public double getSpeed() {
        return -25;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component weapon.
     */
    public String getName() {
        return "Plasma Blaster";
    }
}
