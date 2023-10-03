public abstract class Cabin implements  Components {

    public double getDefense() {
        return 0;
    }

    public double getAttack() {
        return 0;
    }

    public String toString() {
	return "Ship's company: " + getName();
    }

}
