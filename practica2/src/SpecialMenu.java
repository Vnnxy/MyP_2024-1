import java.util.Hashtable;
import java.util.Iterator;
/**
 * Class representing the Daily Menu
 * Saves the burgers on a Hashtable
 * Implements the Menu interface
 * @author equipo.
 */

public class SpecialMenu implements Menu {

    /*The special Menu*/
    private Hashtable<Integer,Burger> burgers;

    /**
     * Builds the special Menu
     * adds three burgers to the menu
     */
    public SpecialMenu(){
	burgers = new Hashtable<>();
	burgers.put(1, new StartupBurger());
	burgers.put(2, new UniqueBurger());
	burgers.put(3, new WagyuBurger());
    }

    /**
     * Method that gives a little description of the menu.
     * @return String the description
     */
     @Override
     public String menuDescription(){
	 return "The fancy,clssy, special menu";
     }

    /**
     * Returns an iterator over elements of type Burger
     * @return Iterator of Burgers
     */
    @Override
    public Iterator<Burger> iterator(){
	return burgers.values().iterator();
    }
    
}
