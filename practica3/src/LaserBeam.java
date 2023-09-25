/**
 * Class that represents the Laser Beam
 * 
 * @author equipo.
 */
public class LaserBeam extends Gear {

    /**
     * Builds a Laser Beam decorator
     * 
     * @param soldier the soldier
     */
    public LaserBeam(Soldier soldier) {
        super(soldier);
	this.soldier.setDp(soldier.getDp() +2);
	this.soldier.setDefense(soldier.getDefense() -1);
	this.soldier.setGear(soldier.getGear() + "Laser beam, ");
    }
}
