import java.util.Iterator;
/**
 * Class representing the General Menu
 * Saves the burgers on an array
 * Implements the Menu interface
 * @author equipo.
 */

public class GeneralMenu implements Menu {

    /*The general Menu*/
    private Burger[] burgers;

    /**
     * Builds the general Menu
     * adds three burgers to the menu
     */
    public GeneralMenu(){
	burgers = new Burger[3];
	burgers[0] = new ChickenBurger();
	burgers[1] = new SimpleBurger();
	burgers[2] = new MushroomBurger();
    }

    /**
     * Method that gives a little description of the menu.
     * @return String the description
     */
     @Override
     public String menuDescription(){
	 return "The all-known general menu";
     }

    /*Internal class for array iterator*/
    private class GeneralMenuIterator implements Iterator<Burger> {

	/*The index*/
	int index;

	/* This method returns true if the iterations has more elements*/
	@Override
	public boolean hasNext(){
	    if(index < burgers.length)
		return true;
	    return false;
	}

	/*Returns the next element in the iteration*/
	@Override
	public Burger next(){
	    if (this.hasNext())
		return burgers[index++];
	    return null;
	}
	
    }

    /**
     * Returns an iterator over elements of type Burger
     * @return Iterator of Burgers
     */
    @Override
    public Iterator<Burger> iterator(){
	return new GeneralMenuIterator();
    }
    
}
