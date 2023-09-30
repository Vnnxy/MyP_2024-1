/**
 * Class that represents a StartupBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class StartupBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public StartupBurger(String menu){
	this.id = 3001;
	this.price = 5342.2;
	this.description = "A startup burger";
	this.name = "Startup Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }
    
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
}
