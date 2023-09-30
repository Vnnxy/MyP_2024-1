import java.util.Scanner;

/**
 * Class that represents a Burger that the restaurant will be using.
 * 
 * @author equipo.
 */
public abstract class Burger {

    /* The id of the burger. It is unique */
    protected int id;
    /* The monetary price of the item */
    protected double price;
    /* The description of the burger */
    protected String description;
    /* The name of the Burger */
    protected String name;
    /* This tells us if the burger will contain cheese or not */
    protected boolean hasCheese;
    /* This will tell us if the burger is vegetarian or not */
    protected boolean isVegetarian;
    /* The name of the menu the burger is in */
    protected String menu;


    /**
     * The method that creates the burger. It calls all the methods needed to make
     * an actual burger.
     * It assembles it.
     * 
     */
    public void prepareBurger() {
        prepareBread();
        spreadMayonnaise();
        addMustard();
        String protein = prepareProtein();
        addProtein(protein);
        askCustomerCheese();
        addCheese();
        addVeggies();
        addKetchup();
        addBread();
    }

    /**
     * The method that prepares the bread.
     */
    private void prepareBread() {
        System.out.println("Getting a bun and toasting it");
    }

    /**
     * The method that spreads the mayonnaise.
     */
    private void spreadMayonnaise() {
        System.out.println("Shlup, mayyonaise added");
    }

    /**
     * The method that adds mustard.
     */
    private void addMustard() {
        System.out.println("Adding mustard, after all, life is all about spiciness");
    }

    /**
     * Abstract method that each burger will implement depending on the protein they
     * use..
     */
    public abstract String prepareProtein();

    /**
     * The method for adding the protein to the burger
     * @param protein the protein String
     */
    private void addProtein(String protein) {
        System.out.println("After carefully cooking your " + protein + " and it's time to assemble");
    }

    /**
     * Abstract method that each burger will implement depending on the way they add
     * cheese.
     */
    public abstract void addCheese();

    /**
     * Hook method that asks the customer (console) if the burger will contain
     * cheese or not.
     * This sets the boolean hasCheese.
     */
    public void askCustomerCheese() {
        String message = "Burgers usually have cheese in them, would you like some? \n [yes]   [no]";
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();

        if (response.equals("yes")) {
            hasCheese = true;
        } else if (response.equals("no"))
            hasCheese = false;
        else {
            System.out.println("I don't understand, is it a yes or a no?");
            askCustomerCheese();
        }
    }

    /**
     * The method to add veggies
     */
    private void addVeggies() {
        System.out.println("You got to eat your veggies said grandma");
    }

    /**
     * The method to squeeze ketchup.
     */
    private void addKetchup() {
        System.out.println("Adding ketchup");
    }

    /**
     * The method that adds the final bun.
     */
    private void addBread() {
        System.out.println("Now the other bun, and it's a BURGER");
    }

    /**
     * Method that gives us the string representation of the burger.
     * 
     * @return String The string representation of the burger.
     */
    public String toString() {
        String rep = "Id: %d , Name: %s, Price:$ %.2f \n Menu: %s  Description: %s, Vegetarian: %s";
        String burgerString = String.format(rep, id, name, price, menu, description, String.valueOf(isVegetarian));
        return burgerString;
    }

    /**
     * Method that returns the burger's id
     * @return int the id
     */
    public int getId(){
	return this.id;
    }

}
