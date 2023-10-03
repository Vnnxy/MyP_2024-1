/**
 * Class for the CustomShip that will create a unique ship.
 * 
 * @author equipo.
 */
public class CustomShip extends StarForge {

	/* boolean to know if it is an engine */
	private boolean isJetEngine;
	/* boolean to know if it is an armor */
	private boolean isArmor;
	/* boolean to know if it is an weapon */
	private boolean isWeapon;
	/* boolean to know if it is an cabin */
	private boolean isCabin;

	/**
	 * Method we will be using to add an engine
	 * 
	 * @param engine The engine that we'll add
	 */
	public void addJetEngine(Components engine) {
		if (this.isJetEngine) {
			System.out.println("You can only add one Jet Engine");
			return;
		}
		parts.add(engine);
		this.isJetEngine = true;
	}

	/**
	 * Method we will be using to add the armor
	 * 
	 * @param armor The armor that we'll add
	 */
	public void addArmor(Components armor) {
		if (this.isArmor) {
			System.out.println("You can only add one Armor");
			return;
		}
		parts.add(armor);
		this.isArmor = true;
	}

	/**
	 * Method we will be using to add a weapon
	 * 
	 * @param weapon The weapon that we'll add
	 */
	public void addWeapon(Components weapon) {
		if (this.isWeapon) {
			System.out.println("You can only add one Weapon");
			return;
		}
		parts.add(weapon);
		this.isWeapon = true;
	}

	/**
	 * Method we will be using to add the cabin
	 * 
	 * @param cabin The cabin that we'll add
	 */
	public void addCabin(Components cabin) {
		if (this.isCabin) {
			System.out.println("You can only add one Cabin");
			return;
		}
		parts.add(cabin);
		this.isCabin = true;
	}
}
