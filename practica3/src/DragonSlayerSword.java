/**
 * Class that represents the DragonSlayer Sword
 * 
 * @author equipo.
 */
public class DragonSlayerSword extends Gear {

    /**
     * Builds a Dragon Slayer Sword decorator
     * 
     * @param soldier the soldier
     */
    public DragonSlayerSword(Soldier soldier) {
        super(soldier);
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return int damage points
     */
    @Override
    public int getDp() {
        return soldier.getDp() + 3;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return int defense points
     */
    @Override
    public int getDefense() {
        return soldier.getDefense() - 1;
    }

    /**
     * Method that returns the description.
     * 
     * @return String
     */
    @Override
    public String getDescription(){
	return " using Dragon Slayer Sword  ";
    }

}
