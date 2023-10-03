public abstract class JetEngine implements Components {

    public double getDefense() {
        return 0;
    }

    public double getAttack() {
        return 0;
    }
    
    public String toString() {
	return "Jet Engine: " + getName();
    }
    
}
