/**
 * Class that represents a SoyBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class SoyBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 1003;
    /* The monetary price of the item */
    public double price = 5.2;
    /* The description of the burger */
    public String description = "A soy burger";
    /* The name of the Burger */
    public String name = "Soy Burger";
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
        System.out.println("Just cooking some tofu for you");
        return "Soy protein";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("With cheese, you won't be able to know the difference");
        else
            System.out.println("No cheese, just soy. Got it!");
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
