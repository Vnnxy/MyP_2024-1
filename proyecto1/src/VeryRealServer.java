import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/**
 * Class representing the completely real server tha we are definetely not
 * simulating.
 * 
 * @author equipo.
 */
public class VeryRealServer {

    /* The hashmap containing the registered users */
    private HashMap<Integer, Observer> users = new HashMap<>();

    /* The catalogue that will be displayed */
    private Catalogue catalogue = new Catalogue();

    /* The user builder */
    private UserBuilder user = new UserBuilder();

    public VeryRealServer() {
        User user1 = user.setName("Mikaela Radrochzky").setUsername("Isa").setAddress("Segovia 332, Madrid")
                .setAccount(4321).setPhone(321321).setPassword("ImIsa").setCountry("Spain").setId(1).setBalance(7000)
                .getUser();
        User user2 = user.setName("Tyronne Stones").setUsername("stone").setAddress("Viking Rd 422, NV")
                .setAccount(1234).setPhone(99382).setPassword("stone123").setCountry("USA").setId(2).setBalance(20000)
                .getUser();
        User user3 = user.setName("Valentin Elizalde").setUsername("gallodeoro").setAddress("C. del Huerto 88, Tijuana")
                .setAccount(88).setPhone(998763).setPassword("veteya:(").setCountry("Mexico").setId(3).setBalance(40000)
                .getUser();
        users.put(1, user1);
        users.put(2, user2);
        users.put(3, user3);

        randomDeal();
    }

    /**
     * Sets the users with the given deals.
     */
    private void randomDeal() {
        String country = decideDeal();
        if (country.equals("None"))
            return;
        for (Observer ob : users.values()) {
            User userNow = (User) ob;
            if (userNow.getCountry().equals(country))
                userNow.setDeal(true);
        }
    }

    /**
     * Private class that decides if the user will get a deal
     * 
     * @return The country that has deals, return "None" if the deals are not
     *         applicable to other countries.
     */
    private String decideDeal() {
        Random random = new Random();
        int deal = random.nextInt(4);
        String country = "";
        switch (deal) {
            case 0:
                country = "Mexico";
                break;
            case 1:
                country = "USA";
                break;
            case 2:
                country = "Spain";
                break;
            case 3:
                country = "None";
                break;
        }
        return country;
    }

    /**
     * Returns the user in the databse (hashmap)
     * 
     * @param id The id of the user we are searching for.
     * @return The requested user.
     */
    public User getUser(int id) {
        return (User) users.get(id);
    }

    /**
     * Returns the user in the databse (hashmap)
     * 
     * @param username The username of the user we are searching for.
     * @return The requested user.
     * @return null if the user isn't found.
     */
    public ProxyUser getUser(String username) {
        for (Observer ob : users.values()) {
            User userNow = (User) ob;
            if (userNow.getUsername().equals(username))
                return new ProxyUser(userNow);
        }
        return null;
    }

    /**
     * Creates a proxy for the user.
     * 
     * @param user The User that will be the proxy owner
     * @return The proxy.
     */
    public ProxyUser getProxy(User user) {
        return new ProxyUser(user);
    }

    /**
     * .
     * Getter for the product. It retrieves the product from the catalogue.
     * 
     * @return The desired product.
     */
    public Product getProduct(int id) {
        return catalogue.getProduct(id);
    }

    /**
     * Getter for the catalogue iterator.
     * 
     * @return The iterator for the catalogue.
     */
    public Iterator<Product> getCatalogue() {
        return catalogue.iterator();
    }
}
