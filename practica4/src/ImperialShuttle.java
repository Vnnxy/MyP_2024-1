public class ImperialShuttle extends StarForge {

    private Components engine;
    private Components armor;
    private Components weapon;
    private Components cabin;

    public ImperialShuttle() {
	this.engine = new InterPlanetary();
	this.armor = new Reinforced();
	this.weapon = new PlasmaBlaster();
	this.cabin = new SmallCrew();
	this.parts.add(engine);
	this.parts.add(armor);
	this.parts.add(weapon);
	this.parts.add(cabin);
    }

    public void addJetEngine(Components engine) {
        System.out.println(noAddition());
    }

    public void addArmor(Components armor) {
         System.out.println(noAddition());
    }

    public void addWeapon(Components weapon) {
         System.out.println(noAddition());
    }

    public void addCabin(Components cabin) {
         System.out.println(noAddition());
    }

    private String noAddition(){
	return "The Imperial Shuttle has defined its components";
    }

}
