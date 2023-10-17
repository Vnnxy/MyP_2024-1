import java.util.*;

/**
 * Class that contains the client.
 * 
 * @author equipo.
 */
public class Client {

    /* The language of the client */
    private Language language;
    /* The shopping cart */
    private ArrayList<Product> cart;
    /* The Catalogue iterator */
    private Iterator<Product> catalogue;

    /**
     * Public Constructor for the CLient.
     * 
     * @param language the language of the interface
     */
    public Client(Language language) {
        this.language = language;
        cart = new ArrayList<Product>();
    }

    /**
     * Displays the catalogue.
     * 
     * @param iterator the iterator given by the catalogue.
     */
    public void showCatalogue(Iterator<Product> iterator) {
        while (iterator.hasNext()) {
            System.out.println(String.format("\t %s \n", iterator.next().toString()));
        }
    }

    /**
     * Method to add a product to the shopping cart
     * 
     * @param product The desired product
     */
    public void addProduct(Product product) {
        cart.add(product);
    }

    /**
     * Method that gives the welcome message
     * 
     * @return the message
     */
    public String welcome() {
        return language.welcome();
    }

    /**
     * Method that displays the main menu options
     * 
     * @return the options
     */
    public String menuOptions() {
        return language.menuOptions();
    }

    /**
     * Method that return a message to indicate that the user must write a valid
     * option
     * 
     * @return the message
     */
    public String validOption() {
        return language.validOption();
    }

    /**
     * Method that displays the add to cart menu, this menu is shown if the user
     * selects Buy in the main menu
     * 
     * @return the menu
     */
    public String addToCart() {
        return language.addToCart();
    }

    /**
     * Method that displays the message for the safe sell, this message is shown
     * only if the user selects the pay option
     * 
     * @return the message
     */
    public String safeSell() {
        return language.safeSell();
    }

    /**
     * Method that displays the ticket
     * 
     * @return the ticket
     */
    public String ticket() {
        return language.ticket();
    }

    /**
     * Method that gives the deliver date
     * 
     * @return the date
     */
    public String deliverDate() {
        return language.deliverDate();
    }

    /**
     * Method that displays the error message when the account does not match
     * 
     * @return the message
     */
    public String falseAccount() {
        return language.falseAccount();
    }

}
