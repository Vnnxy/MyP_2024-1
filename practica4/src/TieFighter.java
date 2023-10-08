/**
 * Class for the Tie Fighter from our catalogue.
 * 
 * @author equipo.
 */
public class TieFighter extends StarForge {

    /* The engine of the ship */
    private Components engine;
    /* The armor of the ship */
    private Components armor;
    /* The weapon of the ship */
    private Components weapon;
    /* The cabin of the ship */
    private Components cabin;

    /**
     * Public constructor for the TieFighter
     */
    public TieFighter() {
        this.engine = new InterContinental();
        this.armor = new Simple();
        this.weapon = new SimpleLaser();
        this.cabin = new Individual();
        this.parts.add(engine);
        this.parts.add(armor);
        this.parts.add(weapon);
        this.parts.add(cabin);
    }

    /**
     * Method we will be using to add an engine
     * 
     * @param engine The engine that we'll add
     */
    public void addJetEngine(Components engine) {
        System.out.println(noAddition());
    }

    /**
     * Method we will be using to add the armor
     * 
     * @param armor The armor that we'll add
     */
    public void addArmor(Components armor) {
        System.out.println(noAddition());
    }

    /**
     * Method we will be using to add a weapon
     * 
     * @param weapon The weapon that we'll add
     */
    public void addWeapon(Components weapon) {
        System.out.println(noAddition());
    }

    /**
     * Method we will be using to add the cabin
     * 
     * @param cabin The cabin that we'll add
     */
    public void addCabin(Components cabin) {
        System.out.println(noAddition());
    }

    /**
     * Private method because the tie fighter has its components defined
     * 
     * @return
     */
    private String noAddition() {
        return "The Tie Fighter has defined its components";
    }

}
