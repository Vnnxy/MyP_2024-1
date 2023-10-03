public abstract class Weapons implements Components {
    
    public double getDefense() {
        return 0;
    }
    
    public String toString() {
	return "Weapon system: " + getName();
    }
}
