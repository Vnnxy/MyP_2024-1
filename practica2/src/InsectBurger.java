/**
 * Class that represents an InsectBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class InsectBurger extends Burger {

    /* The id of the burger. It is unique */
    public int id = 1002;
    /* The monetary price of the item */
    public double price = 8;
    /* The description of the burger */
    public String description = "An insect burger";
    /* The name of the Burger */
    public String name = "Insect Burger";
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
        System.out.println("I guess everyone has unique tastes. I acknowledge that, but you are disgusting ");
        return "Insect mashup";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding it, Why not add cheese, said no one ever on earth.");
        else
            System.out.println("It could work, but I guess you are sticking with the safe option");
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
