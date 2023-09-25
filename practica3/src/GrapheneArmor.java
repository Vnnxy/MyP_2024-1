/**
 * Class that represents the Graphene armor
 * 
 * @author equipo.
 */
public class GrapheneArmor extends Gear {

    /**
     * Builds a graphene armor decorator
     * 
     * @param soldier the soldier
     */
    public GrapheneArmor(Soldier soldier) {
        super(soldier);
	this.soldier.setSpeed(soldier.getSpeed() -1);
	this.soldier.setDefense(soldier.getDefense() +3);
	this.soldier.setGear(soldier.getGear() + "Graphene Armor, ");
    }
}
