/**
 * Class for the PlanetDestroyer Weapon..
 * 
 * @author equipo.
 */
public class PlanetDestroyer extends Weapons {

    /**
     * Credit getter.
     * 
     * @return double the credit of the weapon.
     */
    public double getCredit() {
        return 10000;
    }

    /**
     * Attack getter.
     * 
     * @return double the attack of the weapon.
     */
    public double getAttack() {
        return 2000;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the weapon.
     */
    public double getWeight() {
        return 300;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the weapon.
     */
    public double getSpeed() {
        return -100;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component weapon.
     */
    public String getName() {
        return "Planet Destroyer Super Laser";
    }
}
