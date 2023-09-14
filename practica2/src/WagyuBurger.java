/**
 * Class that represents a WagyuBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class WagyuBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 3003;
    /* The monetary price of the item */
    public double price = 4342.2;
    /* The description of the burger */
    public String description = "A wagyu burger";
    /* The name of the Burger */
    public String name = "Wagyu Burger";
    /* This tells us if the burger will contain cheese or not */
    public boolean hasCheese;
    /* This will tell us if the burger is vegetarian or not */
    public boolean isVegetarian = false;
    /* The name of the menu the burger is in */
    public String menu = "Special Menu";

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Teleporting to a farm in Japan...\n ...\n ... \n I'm back, now searing this.");
        return "A5 Wagyu";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese to overlap the delicousness of wagyu and ruining the burger");
        else
            System.out.println("No cheese! \n Thank you. Really");
    }

    /**
     * Method that gives us the string representation of the burger.
     * 
     * @return String The string representation of the burger.
     */
    public String toString() {
        String rep = "Id: %d , Name: %s, Price:$ %f, Description: %s, Vegetarian: %s";
        String burgerString = String.format(rep, id, name, price, description, String.valueOf(isVegetarian));
        return burgerString;
    }
}
