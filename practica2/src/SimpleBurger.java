 /**
 * Class that represents a SimpleBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class SimpleBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public SimpleBurger(String menu){
	this.id = 2003;
	this.price = 3;
	this.description = "A simple burger";
	this.name = "Simple Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Simple and classic and..... boring, a piece of meat");
        return "Slice of meat";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("From a simple burger to a.... CHEESE burger, it'll be $15 now...");
        else
            System.out.println("It will remain as a simple burger");
    }
}
