import java.util.ArrayList;

public class SpaceShip {
    
    private double credit;
    private double speed;
    private double defense;
    private double weight;
    private double attack;
    private ArrayList<Components> parts = new ArrayList<>();

    public SpaceShip() {
	speed = 100;
	defense = 100;
	weight = 100;
    }

    public void setParts(ArrayList<Components> parts) {
        this.parts = parts;
	for (Components comp : parts){
	    this.credit += comp.getCredit();
	    this.speed += comp.getSpeed();
	    this.defense += comp.getDefense();
	    this.weight += comp.getWeight();
	    this.attack += comp.getAttack();
	}
    }
    
    public String toString() {
        StringBuffer sb = new StringBuffer();
	sb.append("New SpaceShip \n");
	sb.append("Its stats: \n");
	sb.append("Speed: ").append(speed).append("\n");
	sb.append("Defense: ").append(defense).append("\n");
	sb.append("Weight: ").append(weight).append("\n");
	sb.append("Attack: ").append(attack).append("\n");
	sb.append("This brand new ship is equip with: \n");
	for (Components comp : parts){
	    sb.append(comp.toString()).append("\n");
	}
	sb.append("Aaand its price is: ").append(credit);
	return sb.toString();
    }

    public double getCredit() {
        return credit;
    }

}
