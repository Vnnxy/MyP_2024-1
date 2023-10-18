/**
 * Interface that represents the user.
 * 
 * @author equipo.
 */
public interface UserInterface {

    /**
     * Getter for the deals
     * 
     * @return If the user has a deal.
     */
    public boolean hasDeal();

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void pay();

    /**
     * Validates if the accounts between the user and the server match
     * 
     * @param account the bank account
     * @return true if the account is correct
     */
    public boolean validate(int account);

    /**
     * Public getter for the bank account
     * 
     * @return the bank account
     */
    public int getAccount();

    /**
     * Public getter for the balance of the bank account
     * 
     * @return the balance
     */
    public double getBalance();

    /**
     * Getter for the user's country of residence
     * 
     * @return The country of the user.
     */
    public String getCountry();

    /**
     * Method to add a product to the shopping cart
     * 
     * @param product The desired product
     */
    public void addProduct(Product product);

    /**
     * Public getter for the user's password
     * 
     * @return the password
     */
    public String getPassword();

    /**
     * Public getter for the user's username
     * 
     * @return the username
     */
    public String getUsername();

    /**
     * Method that resets the shopping cart and the total for a new session.
     */
    public void reset();

}
