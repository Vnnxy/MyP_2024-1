/**
 * Class that represents a MushroomBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class MushroomBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 2002;
    /* The monetary price of the item */
    public double price = 4;
    /* The description of the burger */
    public String description = "A mushroom burger";
    /* The name of the Burger */
    public String name = "Mushroom Burger";
    /* This tells us if the burger will contain cheese or not */
    public boolean hasCheese;
    /* This will tell us if the burger is vegetarian or not */
    public boolean isVegetarian = false;
    /* The name of the menu the burger is in */
    public String menu = "General Menu";

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Give me a sec... \n Here is your mushroom cow meat \n shift shift");
        return "Mushroom cow meat";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Cheese and mushrooms coming up. A delicious combo!");
        else
            System.out.println("No cheese for this delicious burger");
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
