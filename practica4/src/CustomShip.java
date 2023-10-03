public class CustomShip extends StarForge {

    private boolean isJetEngine;
    private boolean isArmor;
    private boolean isWeapon;
    private boolean isCabin;

    public void addJetEngine(Components engine) {
	if (this.isJetEngine){
	    System.out.println("You can only add one Jet Engine");
	    return;
	}
        parts.add(engine);
	this.isJetEngine = true;
    }

    public void addArmor(Components armor) {
	if (this.isArmor){
	    System.out.println("You can only add one Armor");
	    return;
	}
        parts.add(armor);
	this.isArmor = true;
    }

    public void addWeapon(Components weapon) {
	if (this.isWeapon){
	    System.out.println("You can only add one Weapon");
	    return;
	}
        parts.add(weapon);
	this.isWeapon = true;
    }

    public void addCabin(Components cabin) {
	if (this.isCabin){
	    System.out.println("You can only add one Cabin");
	    return;
	}
        parts.add(cabin);
	this.isCabin = true;
    }
}
