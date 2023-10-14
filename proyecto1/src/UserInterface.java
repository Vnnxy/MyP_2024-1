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
    public void setBalance(int price);

    /**
     * Validates if the accounts between the user and the server match
     * 
     * @param account the bank account
     */
    public void validate(int account);

    /**
     * Public getter for the bank account
     * 
     * @return the bank account
     */
    public int getAccount();

}
