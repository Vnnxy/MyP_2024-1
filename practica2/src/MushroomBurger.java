/**
 * Class that represents a MushroomBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class MushroomBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public MushroomBurger(String menu){
	this.id = 2002;
	this.price = 4;
	this.description = "A mushroom burger";
	this.name = "Mushroom Burger";
	this.isVegetarian = false;
	this.menu = menu;
    }

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
}
