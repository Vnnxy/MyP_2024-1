import java.util.ArrayList;

public class SpaceShip {
    private double credit;
    protected ArrayList<Components> parts = new ArrayList<>();

    public void setParts(ArrayList<Components> parts) {
        this.parts = parts;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public String toString() {
        return "";
    }

    public double getCredit() {
        return credit;
    }

}
