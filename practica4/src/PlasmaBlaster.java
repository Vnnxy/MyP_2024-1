public class PlasmaBlaster extends Weapons {

    public double getCredit() {
        return 24500;
    }

    public double getAttack() {
        return 920;
    }

    public double getWeight() {
        return 155;
    }

    public String getName() {
        return "Plasma Blaster";
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
