/**
 * Class representing the Wii.
 * Extends ElectricDevices
 * 
 * @author equipo.
 */
public class Wii extends ElectricDevices {

    /* The id of the product */
    private int id = 3002;
    /* The name of the product */
    private String name = "Wii";
    /* The description of the product */
    private String description = "Consola ed videojuegos";
    /* The type of the product */
    private String type = "Dispositivo Electrico";
    /* The price of the product */
    private int price = 5000;

    /**
     * Public getter for the price of the product
     * 
     * @return The price of the product
     */
    public int getPrice() {
        return price;
    }

    /**
     * Public setter for the price of the product.
     * 
     * @param price The price of the product
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Public getter for the id of the product.
     * 
     * @return the Id of the product.
     */
    public int getId() {
        return id;
    }

    /**
     * Public getter for the description of the product
     * 
     * @return a String representation of the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Public getter for the name of the product
     * 
     * @return a String representation of the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Public getter for the type or category of the product
     * 
     * @return a String representation of the category.
     */
    public String getType() {
        return type;
    }

    /**
     * Clones the product
     * 
     * @return clone
     */
    public Product clone() {
        return (Product) this.clone();
    }
}
