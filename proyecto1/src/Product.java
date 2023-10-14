/**
 * Interface that represents a product sold by the shop.
 * 
 * @author equipo.
 */

public interface Product extends Cloneable {

    /**
     * Public getter for the price of the product
     * 
     * @return The price of the product
     */
    public int getPrice();

    /**
     * Public setter for the price of the product.
     * 
     * @param price The price of the product
     */
    public void setPrice(int price);

    /**
     * Public getter for the id of the product.
     * 
     * @return the Id of the product.
     */
    public int getId();

    /**
     * Public getter for the description of the product
     * 
     * @return a String representation of the description.
     */
    public String getDescription();

    /**
     * Public getter for the name of the product
     * 
     * @return a String representation of the name.
     */
    public String getName();

    /**
     * Public getter for the type or category of the product
     * 
     * @return a String representation of the category.
     */
    public String getType();

    public abstract Product clone() throws CloneNotSupportedException;
}
