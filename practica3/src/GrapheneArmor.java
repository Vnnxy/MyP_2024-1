/**
 * Class that represents the Graphene  armor
 * 
 * @author equipo.
 */
public class GrapheneArmor extends Gear{

    /**
     * Builds a graphene armor decorator
     * @param soldier the soldier
     */
    public GrapheneArmor(Soldier soldier){
	super(soldier);
    }

    /**
     * Method that returns the soldier´s speed.
     * @return int speed.
     */
    @Override
    public int getSpeed(){
	return soldier.getSpeed() -1;
    }

    /**
     * Method that returns the soldier´s defense points.
     * @return int defense points
     */
    @Override
    public int getDefense(){
	return soldier.getDefense() +3;
    }

    /**
     * Method that returns the soldier´s full report.
     * @return String 
     */
    @Override
    public String toString(){
	return soldier.toString() + " using Graphene Armor";
    }
    
}
