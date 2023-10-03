import java.util.ArrayList;

public abstract class StarForge {

    protected ArrayList<Components> parts = new ArrayList<>();

    public StarForge(){
	parts = new ArrayList<>();
    }

    public abstract void addJetEngine(Components engine);

    public abstract void addArmor(Components armor);

    public abstract void addWeapon(Components weapon);

    public abstract void addCabin(Components cabin);

    public SpaceShip getSpaceShip() {
        SpaceShip spaceShip = new SpaceShip();
        spaceShip.setParts(parts);
        return spaceShip;
    }
}
