/**
 * Class for the Fortress armor..
 * 
 * @author equipo.
 */
public class Fortress extends Armor {

    /**
     * Credit getter.
     * 
     * @return double the credit of the armor.
     */
    public double getCredit() {
        return 1500;
    }

    /**
     * Defense getter.
     * 
     * @return double the speed of the armor.
     */
    public double getDefense() {
        return 150;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the armor.
     */
    public double getWeight() {
        return 200;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the armor.
     */
    public double getSpeed() {
        return -100;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component armor.
     */
    public String getName() {
        return "Fortress";
    }
}
