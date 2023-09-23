/**
 * Class that represents the Kevlar armor
 * 
 * @author equipo.
 */
public class KevlarArmor extends Gear{

    /**
     * Builds a kevlar armor decorator
     * @param soldier the soldier
     */
    public KevlarArmor(Soldier soldier){
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
	return soldier.getDefense() +2;
    }

    /**
     * Method that returns the soldier´s full report.
     * @return String 
     */
    @Override
    public String toString(){
	return soldier.toString() + " using Kevlar Armor";
    }
    
}
