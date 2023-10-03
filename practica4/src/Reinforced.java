/**
 * Class for the Reinforced armor..
 * 
 * @author equipo.
 */
public class Reinforced extends Armor {

    /**
     * Credit getter.
     * 
     * @return double the credit of the armor.
     */
    public double getCredit() {
        return 1000;
    }

    /**
     * Defense getter.
     * 
     * @return double the speed of the armor.
     */
    public double getDefense() {
        return 100;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the armor.
     */
    public double getWeight() {
        return 150;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the armor.
     */
    public double getSpeed() {
        return -50;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component armor.
     */
    public String getName() {
        return "Reinforced";
    }
}
