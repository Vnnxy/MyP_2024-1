/**
 * Class representing the User.
 * 
 * @author equipo.
 */
public class User implements UserInterface {
    /* The id of the user */
    private int id;
    /* The password of the user */
    private String password;
    /* The username of the user */
    private String username;
    /* The name of the user */
    private String name;
    /* The country of the user */
    private String country;
    /* The phone number of the user */
    private int phone;
    /* The bank account of the user */
    private int account;
    /* The address of the user */
    private String address;
    /* Boolean representing if the user has a deal or not */
    private boolean hasDeal;
    /* The balance of the user */
    private int balance;

    /**
     * Sets the deals for the user
     * 
     * @param hasDeal boolean representing if the user has deals
     */
    public void setDeal(boolean hasDeal) {
        this.hasDeal = hasDeal;
    }

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void setBalance(int price) {
        this.balance = balance - price;
    }

    /**
     * Validates if the accounts between the user and the server match
     * 
     * @param account the bank account
     * @return true if the account mathces
     */
    public boolean validate(int account) {
	return account == this.account;
    }

    /**
     * Public getter for the bank account
     * 
     * @return the bank account
     */
    public int getAccount() {
        return account;
    }

    /**
     * Public setter for the user's id
     * 
     * @param id the id of the user
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Public setter for the user's password
     * 
     * @param password the user's password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Public setter for the user's username
     * 
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Public setter for the user's name
     * 
     * @param name the name of the user
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Public setter for the user's nationality
     * 
     * @param country the country where the user resides.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Public setter for the user's phone number
     * 
     * @param phone a valid phone number
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * Public setter for the user's bank account
     * 
     * @param account The bank account
     */
    public void setAccount(int account) {
        this.account = account;
    }

    /**
     * Public setter for the user's public address
     * 
     * @param address a public address in a valid country.
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
