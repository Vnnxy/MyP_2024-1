/**
 * Class that represents the Iron Cheems
 * 
 * @author equipo.
 */
public class IronCheems extends Gear {

    /**
     * Builds an Iron Cheems decorator
     * 
     * @param soldier the soldier
     */
    public IronCheems(Soldier soldier) {
        super(soldier);
	if (!soldier.isCaptain() || soldier.hasIronCheemsBeenUsed()){
	    System.out.println("Iron Cheems can only be used by captains and just one time, beginning self destruction ...");
	}
	else {
	    this.soldier.setDp(soldier.getDp() +2);
	    this.soldier.setDefense(soldier.getDefense() +2);
	    this.soldier.setSpeed(soldier.getSpeed() +2);
	    this.soldier.setGear(soldier.getGear() + "Iron Cheems, ");
	}
    }
    
    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    @Override
    public boolean hasIronCheemsBeenUsed() {
        return true;
    }
}
