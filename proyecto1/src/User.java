import java.util.ArrayList;

/**
 * Class representing the User.
 * 
 * @author equipo.
 */
public class User implements UserInterface, Observer {
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
    private double balance;
    /* The shopping cart */
    private ArrayList<Product> cart;
    /* The total cost */
    private double total;

    public User(UserBuilder builder) {
        cart = new ArrayList<>();
        id = builder.getId();
        password = builder.getPassword();
        username = builder.getUsername();
        name = builder.getName();
        country = builder.getCountry();
        phone = builder.getPhone();
        account = builder.getAccount();
        address = builder.getAdress();
        balance = builder.getBalance();
        hasDeal = false;
    }

    /**
     * Sets the deals for the user
     * 
     * @param hasDeal boolean representing if the user has deals
     */
    public void setDeal(boolean hasDeal) {
        this.hasDeal = hasDeal;
    }

    /**
     * Getter for the deals
     * 
     * @return If the user has a deal.
     */
    public boolean hasDeal() {
        return hasDeal;
    }

    /**
     * Public getter for the balance of the bank account
     * 
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void pay(double price) {
        this.balance = balance - price;
        total = price;
    }

    /**
     * Sets the new balance of the user
     * 
     * @param price the price of the shopping cart
     */
    public void pay() {
    }

    /**
     * Sets the balance of the user
     * 
     * @param deposit The money the users wants to add.
     */
    public void setBalance(int deposit) {
        this.balance = deposit;
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
     * Public getter for the user's password
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
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
     * Public getter for the user's username
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
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

    /**
     * Getter for the user's country of residence
     * 
     * @return The country of the user.
     */
    public String getCountry() {
        return country;
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
     * Updates the shopping cart with the one of the proxy.
     * 
     * @param list The proxy's shopping cart
     */
    public void updateList(ArrayList<Product> list) {
        cart = list;
    }

    /**
     * Method that resets the shopping cart and the total for a new session.
     */
    public void reset() {
        cart.clear();
        total = 0;
    }

}
