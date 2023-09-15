/**
 * Class that represents a SoyBurger that the restaurant will be using.
 * 
 * @author equipo.
 */
public class SoyBurger extends Burger {

    /**
     * Builds a new Burger
     * @param menu String that represents the menu
     */
    public SoyBurger(String menu){
	this.id = 1003;
	this.price = 5.2;
	this.description = "A soy burger";
	this.name = "Soy Burger";
	this.isVegetarian = true;
	this.menu = menu;
    }

    /**
     * Method for preparing protein in a specific way unique to the burger.
     */
    @Override
    public String prepareProtein() {
        System.out.println("Just cooking some tofu for you");
        return "Soy protein";
    }

    /**
     * Method for adding cheese to the burger in a specific way.
     */
    @Override
    public void addCheese() {
        if (hasCheese)
            System.out.println("With cheese, you won't be able to know the difference");
        else
            System.out.println("No cheese, just soy. Got it!");
    }
}
