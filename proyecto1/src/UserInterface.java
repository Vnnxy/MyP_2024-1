/**
 * Interface that represents the user.
 * 
 * @author equipo.
 */
public interface UserInterface {

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void pay(int price);

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

}
