/**
 * Interface that represents a menu.
 * Extends Iterable wrapping the generic to Burger
 * 
 * @author equipo.
 */

public interface Menu extends Iterable<Burger> {

    /**
     * Method that gives a little description of the menu.
     * 
     * @return String the description
     */
    public String menuDescription();

}
