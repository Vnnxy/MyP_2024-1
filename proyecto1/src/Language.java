/**
 * Interface that represents the language of the client.
 * 
 * @author equipo.
 */
public interface Language {

    /**
     * Method that gives the welcome message
     * 
     * @return the message
     */
    public String welcome();

    /**
     * Method that displays the main menu options
     * 
     * @return the options
     */
    public String menuOptions();

    /**
     * Method that return a message to indicate that the user must write a valid
     * option
     * 
     * @return the message
     */
    public String validOption();

    /**
     * Method that displyas the add to cart menu, this menu is shown if the user
     * selects Buy in the main menu
     * 
     * @return the menu
     */
    public String addToCart();

    /**
     * Method that displays the message for the safe sell, this message is shown
     * only if the user selects the pay option
     * 
     * @return the message
     */
    public String safeSell();

    /**
     * Method that displays the ticket
     * 
     * @return the ticket
     */
    public String ticket();

    /**
     * Method that gives the deliver date
     * 
     * @return the date
     */
    public String deliverDate();

    /**
     * Method that displays the error message when the account does not match
     * 
     * @return the message
     */
    public String falseAccount();

    /**
     * Method that gives the thanks to the user.
     * 
     * @return the thanks message
     */
    public String thanks();

    /**
     * Method that tells the user the bank contact.
     * 
     * @return The bank message
     */
    public String bank();

    /**
     * Method that tells the user it can't buy the prodduct.
     * 
     * @return The message saying it has no money
     */
    public String notEnoughMoney();

    /**
     * Method that tells the current cart
     * 
     * @return The current cart
     */
    public String cart();

    /**
     * Method that prints if the user has deal
     * 
     * @return If it has a deal
     */
    public String deal();

    /**
     * Method that prints an error if the cart is empty
     * 
     * @return the message
     */
    public String empty();

}
