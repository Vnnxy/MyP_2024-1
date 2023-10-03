public abstract class Armor implements Components {

    public double getAttack() {
	return 0;
    }
    
    public String toString() {
	return "Armor and shields type: " + getName();
    }
}
