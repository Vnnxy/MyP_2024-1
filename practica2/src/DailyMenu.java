import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing the Daily Menu
 * Saves the burgers on an ArrayList
 * Implements the Menu interface
 * 
 * @author equipo.
 */

public class DailyMenu implements Menu {

    /* The daily Menu */
    private ArrayList<Burger> burgers;

    /**
     * Builds the daily Menu
     * adds three burgers to the menu
     */
    public DailyMenu() {
        burgers = new ArrayList<Burger>();
        burgers.add(new GrassBurger(this.menuDescription()));
        burgers.add(new InsectBurger(this.menuDescription()));
        burgers.add(new SoyBurger(this.menuDescription()));
    }

    /**
     * Method that gives a little description of the menu.
     * 
     * @return String the description
     */
    @Override
    public String menuDescription() {
        return "The daily -surprising- menu";
    }

    /**
     * Returns an iterator over elements of type Burger
     * 
     * @return Iterator of Burgers
     */
    @Override
    public Iterator<Burger> iterator() {
        return burgers.iterator();
    }

}
