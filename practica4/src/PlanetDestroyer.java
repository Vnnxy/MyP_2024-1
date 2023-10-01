public class PlanetDestroyer extends Weapons {

    public double getCredit() {
        return 68320;
    }

    public double getAttack() {
        return 1800;
    }

    public double getWeight() {
        return 220;
    }

    public String getName() {
        return "Planet Destroyer";
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
