public class InterContinental extends JetEngine {

    public double getCredit() {
        return 15000;
    }

    public double getSpeed() {
        return 600;
    }

    public double getWeight() {
        return 1500;
    }

    public String getName() {
        return "InterContinental";
    }

    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("\n Engine " + this.getName());
        information.append("\n Credits " + this.getCredit());
        information.append("\n Speed " + this.getSpeed());
        information.append("\n Weight " + this.getWeight());
        information.append("\n Attack " + this.getAttack());
        information.append("\n Defense " + this.getDefense());

        return information.toString();
    }
}
