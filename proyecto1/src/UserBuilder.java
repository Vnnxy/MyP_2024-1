/**
 * Class representing the Builder of User.
 * 
 * @author equipo.
 */
public class UserBuilder implements UserBuilderInterface {
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
    private int phone = 0;
    /* The bank account of the user */
    private int account;
    /* The address of the user */
    private String address;
    /* The balance of the user */
    private int balance;

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public UserBuilderInterface pay(int price) {
        this.balance = balance - price;
        return this;
    }

    /**
     * Sets the balance of the user
     * 
     * @param deposit The money the users wants to add.
     */
    public UserBuilderInterface setBalance(int deposit) {
        this.balance = deposit;
        return this;
    }

    /**
     * Public setter for the user's id
     * 
     * @param id the id of the user
     */
    public UserBuilderInterface setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Public setter for the user's password
     * 
     * @param password the user's password
     */
    public UserBuilderInterface setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Public setter for the user's username
     * 
     * @param username the username
     */
    public UserBuilderInterface setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Public setter for the user's name
     * 
     * @param name the name of the user
     */
    public UserBuilderInterface setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Public setter for the user's nationality
     * 
     * @param country the country where the user resides.
     */
    public UserBuilderInterface setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Public setter for the user's phone number
     * 
     * @param phone a valid phone number
     */
    public UserBuilderInterface setPhone(int phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Public setter for the user's bank account
     * 
     * @param account The bank account
     */
    public UserBuilderInterface setAccount(int account) {
        this.account = account;
        return this;
    }

    /**
     * Public setter for the user's public address
     * 
     * @param address a public address in a valid country.
     */
    public UserBuilderInterface setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * gets the balance of the user
     * 
     * @return The money the users has.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Public getter for the user's id
     * 
     * @return the id of the user
     */
    public int getId() {
        return id;
    }

    /**
     * Public getter for the user's password
     * 
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Public setter for the user's username
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Public getter for the user's name
     * 
     * @return the name of the user
     */
    public String getName() {
        return name;
    }

    /**
     * Public getter for the user's nationality
     * 
     * @return the country where the user resides.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Public getter for the user's phone number
     * 
     * @return a valid phone number
     */
    public int getPhone() {
        return phone;
    }

    /**
     * Public getter for the user's bank account
     * 
     * @return The bank account
     */
    public int getAccount() {
        return account;
    }

    /**
     * Public setter for the user's public address
     * 
     * @param address a public address in a valid country.
     */
    public String getAdress() {
        return address;
    }

    /**
     * Creates the user with the specified parameters.
     * 
     * @return The created user
     */
    public User getUser() {
        return new User(this);
    }
}
