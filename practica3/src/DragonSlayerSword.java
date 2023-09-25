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
	this.soldier.setDp(soldier.getDp() +3);
	this.soldier.setDefense(soldier.getDefense() -1);
	this.soldier.setGear(soldier.getGear() + "Dragon Slayer Sword, ");
    }
}
