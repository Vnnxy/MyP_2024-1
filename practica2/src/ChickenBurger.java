/**
 * Class that represents a ChickenBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class ChickenBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public ChickenBurger(String menu){
	this.id = 2001;
	this.price = 4;
	this.description = "A chicken burger";
	this.name = "Chicken Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("You definetely have taste, a classic, a chicken, a BURGER");
        return "Good old Chicken";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese to create a delicious chicken parm");
        else
            System.out.println("No cheese for the weak and... for the chicken I guess");
    }
}
