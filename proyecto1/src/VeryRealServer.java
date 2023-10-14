import java.util.HashMap;

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

    public User getUser(int id) {
        return users.get(id);
    }

    public UserInterface getProxy(UserInterface user) {
        return null;
    }

    public Product getProduct() {
        return null;
    }

    public Iterator<Product> getCatalogue() {
        return catalogue.iterator();
    }
}
