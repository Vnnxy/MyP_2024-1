/**
 * Class that represents the English language.
 * 
 * @author equipo.
 */
public class English implements Language {

    /**
     * Method that gives the welcome message
     * 
     * @return the message
     */
    public String welcome() {
        return "Welcome to CheemsMart, it´s a pleasure to have you here.";
    }

    /**
     * Method that displays the main menu options
     * 
     * @return the options
     */
    public String menuOptions() {
        StringBuffer sb = new StringBuffer();
        sb.append("Please select an option: \n").append("\t 1.- Show Catalogue \n");
        sb.append("\t 2.- Buy \n").append("\t 3.- Log out \n").append("\t 0.- Exit \n");
        return sb.toString();
    }

    /**
     * Method that return a message to indicate that the user must write a valid
     * option
     * 
     * @return the message
     */
    public String validOption() {
        return "Please write a valid option.";
    }

    /**
     * Method that displyas the add to cart menu, this menu is shown if the user
     * selects Buy in the main menu.
     * 
     * @return the menu
     */
    public String addToCart() {
        StringBuffer sb = new StringBuffer();
        sb.append("Please enter the product's id to add it to the cart or choose an option: \n");
        sb.append("\t 1.- Quit \n").append("\t 2.- Pay \n");
        return sb.toString();
    }

    /**
     * Method that displays the message for the safe sell, this message is shown
     * only if the user selects the pay option
     * 
     * @return the message
     */
    public String safeSell() {
        return "We worry about your security, please write your bank account to verify your identity: \n";
    }

    /**
     * Method that displays the ticket
     * 
     * @return the ticket
     */
    public String ticket() {
        return "Your ticket: \n";
    }

    /**
     * Method that gives the deliver date
     * 
     * @return the date
     */
    public String deliverDate() {
        return "Your deliver date: ";
    }

    /**
     * Method that displays the error message when the account does not match
     * 
     * @return the message
     */
    public String falseAccount() {
        return "Wrong account number. Turning off.";
    }

    /**
     * Method that gives the thanks to the user.
     * 
     * @return the thanks message
     */
    public String thanks() {
        return "Thank you for buying with us!";
    }

    /**
     * Method that tells the user the bank contact.
     * 
     * @return The bank message
     */
    public String bank() {
        return "Please wait while we validate the payment methods.";
    }

    /**
     * Method that tells the user it can't buy the prodduct.
     * 
     * @return The message saying it has no money
     */
    public String notEnoughMoney() {
        return "Im sorry to inform you that you don't have enough money. Please Try again.";
    }

    /**
     * Method that tells the current cart
     * 
     * @return The current cart
     */
    public String cart() {
        return "Your shopping cart contains:";
    }

    /**
     * Method that prints if the user has deal
     * 
     * @return If it has a deal
     */
    public String deal() {
        return "You have 20% off on Electronic Devices! \n Remember that the discount is applied at the end.";
    }
}
