/**
 * Class that represents a StartupBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class StartupBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 3001;
    /* The monetary price of the item */
    public double price = 5342.2;
    /* The description of the burger */
    public String description = "A startup burger";
    /* The name of the Burger */
    public String name = "Startup Burger";
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
        System.out.println("Travelling to Sillicon Valley... \n Got your protein!");
        return "Silicon valley fresh meat";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Sure thing, addin cheese to become a UNICORN STARTUP BURGER, we could call it FTX...");
        else
            System.out.println("No cheese, just a startup burger");
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
