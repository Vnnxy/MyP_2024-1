import java.util.ArrayList;

public abstract class StarForge {

    protected ArrayList<Components> parts = new ArrayList<>();

    public abstract void addJetEngine(JetEngine engine);

    public abstract void addArmor(Armor armor);

    public abstract void addWeapon(Weapons weapon);

    public abstract void addCabin(Cabin cabin);

    public Double getPrice() {
        Double cost = 0.0;
        for (Components part : parts) {
            cost += part.getCredit();
        }
        return cost;
    }

    public String toString() {
        StringBuffer information = new StringBuffer();
        information.append("\n Your Ship contains:");
        for (Components part : parts) {
            information.append(part.toString());
        }
        return information.toString();
    }

    public SpaceShip getSpaceShip() {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setParts(parts);
        spaceShip.setCredit(getPrice());
        return spaceShip;
    }
}
