/**
 * Class that represents a GrassBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class GrassBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public GrassBurger(String menu){
	this.id = 1001;
	this.price = 3;
	this.description = "A grass burger";
	this.name = "Grass Burger";
	this.isVegetarian = true;
	this.menu = menu;
    }

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
}
