public class Reinforced extends Armor {

    public double getCredit() {
        return 20000;
    }

    public double getDefense() {
        return 900;
    }

    public double getWeight() {
        return 1000;
    }

    public String getName() {
        return "Reinforced Armor";
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
