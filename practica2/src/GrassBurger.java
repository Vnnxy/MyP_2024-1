/**
 * Class that represents a GrassBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class GrassBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 1001;
    /* The monetary price of the item */
    public double price = 3;
    /* The description of the burger */
    public String description = "A grass burger";
    /* The name of the Burger */
    public String name = "Grass Burger";
    /* This tells us if the burger will contain cheese or not */
    public boolean hasCheese;
    /* This will tell us if the burger is vegetarian or not */
    public boolean isVegetarian = true;
    /* The name of the menu the burger is in */
    public String menu = "Daily Menu";

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("This is a new one!, Cut some trees, add some beaaans and taraa!");
        return "Grass and Beans mashup";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Grass and cheese, all you needed");
        else
            System.out.println("Thank god you are not putting cheese on that thing");
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
