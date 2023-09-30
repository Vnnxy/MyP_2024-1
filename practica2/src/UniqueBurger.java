/**
 * Class that represents a UniquueBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class UniqueBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public UniqueBurger(String menu){
	this.id = 3002;
	this.price = 4342.2;
	this.description = "A unique burger";
	this.name = "Unique Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Mooo \n Moo \n ... \n We got some fresh protein here");
        return "Tender meat";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese, no one would've thought of adding cheese to it.");
        else
            System.out.println("No cheese, got it.");
    }
}
