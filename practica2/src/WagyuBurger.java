/**
 * Class that represents a WagyuBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class WagyuBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public WagyuBurger(String menu){
	this.id = 3003;
	this.price = 4342.2;
	this.description = "A wagyu burger";
	this.name = "Wagyu Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Teleporting to a farm in Japan...\n ...\n ... \n I'm back, now searing this.");
        return "A5 Wagyu";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("Adding cheese to overlap the delicousness of wagyu and ruining the burger");
        else
            System.out.println("No cheese! \n Thank you. Really");
    }
}
