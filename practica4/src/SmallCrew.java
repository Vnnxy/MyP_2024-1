public class SmallCrew extends Cabin {

    public double getCredit() {
        return 30000;
    }

    public double getWeight() {
        return 1800;
    }

    public String getName() {
        return "Small Crew Cabin";
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
