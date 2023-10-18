import java.util.ArrayList;

/**
 * Class representing the User.
 * 
 * @author equipo.
 */
public class ProxyUser implements UserInterface {
    /* The user the proxy will be interacting with */
    private User user;
    /* The shopping cart */
    private ArrayList<Product> cart;
    /* The total cost */
    private double total;
    /* The discount */
    private double discount = 0;

    public ProxyUser(User user) {
        this.user = user;
        cart = new ArrayList<>();
    }

    /**
     * Getter for the deals
     * 
     * @return If the user has a deal.
     */
    public boolean hasDeal() {
        return user.hasDeal();
    }

    /**
     * Sets the new balance of the user
     * 
     */
    public void pay() {
        String type = "";
        if (user.hasDeal()) {
            switch (user.getCountry()) {
                case "USA":
                    type = "Dispositivos Electricos";
                    break;
                case "Spain":
                    type = "Electrodomesticos";
                    break;
                case "Mexico":
                    type = "Comida";
                    break;
            }
        }
        getDiscount(type);
        user.pay(total - discount);
        user.updateList(cart);
    }

    /**
     * Returns the total discount
     * 
     * @return The discount;
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * Method that calculates the discount
     * 
     * @param type The type of the product
     */
    private void getDiscount(String type) {
        if (type.equals(""))
            return;
        for (Product product : cart) {
            if (product.getType().equals(type))
                discount += product.getPrice();
        }
        discount = (int) discount * .2;
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

    /**
     * Public getter for the balance of the bank account
     * 
     * @return the balance
     */
    public double getBalance() {
        return user.getBalance();
    }

    /**
     * Getter for the user's country of residence
     * 
     * @return The country of the user.
     */
    public String getCountry() {
        return user.getCountry();
    }

    /**
     * Method to add a product to the shopping cart
     * 
     * @param product The desired product
     */
    public void addProduct(Product product) {
        cart.add(product);
        total += product.getPrice();
    }

    /**
     * Public getter for the user's username
     * 
     * @return the username
     */
    public String getUsername() {
        return user.getUsername();
    }

    /**
     * Public getter for the user's password
     * 
     * @return the password
     */
    public String getPassword() {
        return user.getPassword();
    }

    /**
     * Returns the shopping cart string representation
     * 
     * @return string of the products
     */
    public String getShoppingCart() {
        StringBuffer sb = new StringBuffer();
        for (Product product : cart) {
            sb.append("\t" + product.getName() + " " + "$" + product.getPrice() + "\n");
        }
        sb.append("\t" + "TOTAL: $ " + (total - discount) + "\n");
        return sb.toString();
    }

    /**
     * Method that tells us if the user has enough money.
     * 
     * @return True if it has enough money, otherwise False.
     */
    public boolean hasEnoughMoney() {
        return (user.getBalance() >= total);
    }

    /**
     * Method that resets the shopping cart and the total for a new session.
     */
    public void reset() {
        cart.clear();
        total = 0;
        discount = 0;
        user.reset();
    }

    /**
     * Method that tells wheteher the cart is empty
     * 
     * @return true if the cart is empty
     */
    public boolean isEmpty() {
        return cart.isEmpty();
    }

}
