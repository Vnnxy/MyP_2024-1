/**
 * Class representing the User.
 * 
 * @author equipo.
 */
public class ProxyUser implements UserInterface {
    /* The user the proxy will be interacting with */
    private User user;

    public ProxyUser(User user) {
        this.user = user;
    }

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void pay(int price) {
        user.setBalance(price);
    }

    /**
     * Validates if the accounts between the user and the server match
     * 
     * @param account the bank account
     * @return true if the account is correct
     */
    public boolean validate(int account) {
        return user.validate(account);
    }

    /**
     * Public getter for the bank account
     * 
     * @return the bank account
     */
    public int getAccount() {
        return user.getAccount();
    }
}
