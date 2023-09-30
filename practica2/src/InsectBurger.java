/**
 * Class that represents an InsectBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class InsectBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public InsectBurger(String menu){
	this.id = 1002;
	this.price = 8;
	this.description = "An insect burger";
	this.name = "Insect Burger";
	this.isVegetarian = true;
	this.menu = menu;
    }

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
}
