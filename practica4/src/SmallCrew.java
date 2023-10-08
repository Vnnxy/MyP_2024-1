/**
 * Class for the SmallCrew cabins..
 * 
 * @author equipo.
 */
public class SmallCrew extends Cabin {

    /**
     * Credit getter.
     * 
     * @return double the credit of the cabin.
     */
    public double getCredit() {
        return 2000;
    }

    /**
     * Weight getter.
     * 
     * @return double the weight of the cabin.
     */
    public double getWeight() {
        return 200;
    }

    /**
     * Speed getter.
     * 
     * @return double the speed of the cabin.
     */
    public double getSpeed() {
        return -10;
    }

    /**
     * Name getter.
     * 
     * @return String the name of the component cabin.
     */
    public String getName() {
        return "Small Crew";
    }
}
