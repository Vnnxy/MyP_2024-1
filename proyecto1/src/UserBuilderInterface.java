/**
 * Interface that represents the Builder for Users.
 * 
 * @author equipo.
 */
public interface UserBuilderInterface {

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public UserBuilderInterface pay(int price);

    /**
     * Sets the balance of the user
     * 
     * @param deposit The money the users wants to add.
     */
    public UserBuilderInterface setBalance(int deposit);

    /**
     * Public setter for the user's id
     * 
     * @param id the id of the user
     */
    public UserBuilderInterface setId(int id);

    /**
     * Public setter for the user's password
     * 
     * @param password the user's password
     */
    public UserBuilderInterface setPassword(String password);

    /**
     * Public setter for the user's username
     * 
     * @param username the username
     */
    public UserBuilderInterface setUsername(String username);

    /**
     * Public setter for the user's name
     * 
     * @param name the name of the user
     */
    public UserBuilderInterface setName(String name);

    /**
     * Public setter for the user's nationality
     * 
     * @param country the country where the user resides.
     */
    public UserBuilderInterface setCountry(String country);

    /**
     * Public setter for the user's phone number
     * 
     * @param phone a valid phone number
     */
    public UserBuilderInterface setPhone(int phone);

    /**
     * Public setter for the user's bank account
     * 
     * @param account The bank account
     */
    public UserBuilderInterface setAccount(int account);

    /**
     * Public setter for the user's public address
     * 
     * @param address a public address in a valid country.
     */
    public UserBuilderInterface setAddress(String address);

    /**
     * Creates the user with the specified parameters.
     * 
     * @return The created user
     */
    public User getUser();
}
