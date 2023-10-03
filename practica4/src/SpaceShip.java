import java.util.ArrayList;

/**
 * Class for our spaceships..
 * 
 * @author equipo.
 */
public class SpaceShip {

    /* The credits it will cost */
    private double credit;
    /* The speed the spaceship will have */
    private double speed;
    /* The speed the spaceship will have */
    private double defense;
    /* The weight the spaceship will have */
    private double weight;
    /* The attack power the spaceship will have */
    private double attack;
    /* The list of parts the spaceship will have */
    private ArrayList<Components> parts = new ArrayList<>();

    /* Constructor with default parameters */
    public SpaceShip() {
        speed = 100;
        defense = 100;
        weight = 100;
    }

    /**
     * The method to set the ship componentes in place
     * 
     * @param parts A list of the components that the builder will provide.
     */
    public void setParts(ArrayList<Components> parts) {
        this.parts = parts;
        for (Components comp : parts) {
            this.credit += comp.getCredit();
            this.speed += comp.getSpeed();
            this.defense += comp.getDefense();
            this.weight += comp.getWeight();
            this.attack += comp.getAttack();
        }
    }

    /**
     * To string method.
     * 
     * @return String The string representation of the ship.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("New SpaceShip \n");
        sb.append("Its stats: \n");
        sb.append("Speed: ").append(speed).append("\n");
        sb.append("Defense: ").append(defense).append("\n");
        sb.append("Weight: ").append(weight).append("\n");
        sb.append("Attack: ").append(attack).append("\n");
        sb.append("This brand new ship is equipped with: \n");
        for (Components comp : parts) {
            sb.append(comp.toString()).append("\n");
        }
        sb.append("Aaand its price is: ").append(credit);
        return sb.toString();
    }

    /**
     * Getter
     * 
     * @return double the credit of the ship.
     */
    public double getCredit() {
        return credit;
    }

}
