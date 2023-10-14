import java.util.HashMap;
import java.util.Iterator;

/**
 * Class representing the catalogue where the client will see the products.
 * 
 * @author equipo.
 */
public class Catalogue implements Iterable<Product> {

    /* The hashmap containing the products mapped to their respective id's */
    private HashMap<Integer, Product> products = new HashMap<>();
    /* The Refrigerator */
    Product refrigerator = new Refrigerator();
    Product microwave = new Microwave();
    Product wotah = new Wotah();
    Product cherry = new Cherry();
    Product pc = new Pc();
    Product wii = new Wii();

    /* Public constructor */
    public Catalogue() {
        products.put(refrigerator.getId(), refrigerator);
        products.put(microwave.getId(), microwave);
        products.put(wotah.getId(), wotah);
        products.put(cherry.getId(), cherry);
        products.put(pc.getId(), pc);
        products.put(wii.getId(), wii);
    }

    /**
     * Method to retrieve the desired product from the catalogue
     * 
     * @param id The barcode id of the item
     * @return The desired product.
     */
    public Product getProduct(int id) {
        return products.get(id);
    }

    /**
     * Returns an iterator over elements of Product
     * 
     * @return Iterator of Product
     */
    @Override
    public Iterator<Product> iterator() {
        return products.values().iterator();
    }
}
