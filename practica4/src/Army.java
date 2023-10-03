/**
 * Class for the Army cabins..
 * 
 * @author equipo.
 */
public class Army extends Cabin {

    /**
     * Credit getter.
     * 
     * @return double the credit of the cabin.
     */
    public double getCredit() {
        return 10000;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the cabin.
     */
    public double getWeight() {
        return 1000;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the cabin.
     */
    public double getSpeed() {
        return -100;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component cabin.
     */
    public String getName() {
        return "Army";
    }
}
