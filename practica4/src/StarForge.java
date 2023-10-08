import java.util.ArrayList;

/**
 * Abstract class for The Builder we will be using.
 * 
 * @author equipo.
 */
public abstract class StarForge {

    /* The list of parts */
    protected ArrayList<Components> parts = new ArrayList<>();

    /* The constructor, we only initialize the list. */
    public StarForge() {
        parts = new ArrayList<>();
    }

    /**
     * Abstract method we will be using to add an engine
     * 
     * @param engine The engine that we'll add
     */
    public abstract void addJetEngine(Components engine);

    /**
     * Abstract method we will be using to add the armor
     * 
     * @param armor The armor that we'll add
     */
    public abstract void addArmor(Components armor);

    /**
     * Abstract method we will be using to add a weapon
     * 
     * @param weapon The weapon that we'll add
     */
    public abstract void addWeapon(Components weapon);

    /**
     * Abstract method we will be using to add the cabin
     * 
     * @param cabin The cabin that we'll add
     */
    public abstract void addCabin(Components cabin);

    /**
     * Method that returns the created spaceship
     * 
     * @return SpaceShip
     */
    public SpaceShip getSpaceShip() {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setParts(parts);
        return spaceShip;
    }
}
