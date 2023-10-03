public class TieFighter extends StarForge {

    private Components engine;
    private Components armor;
    private Components weapon;
    private Components cabin;

    public TieFighter() {
	this.engine = new InterContinental();
	this.armor = new Simple();
	this.weapon = new SimpleLaser();
	this.cabin = new Individual();
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
	return "The Tie Fighter has defined its components";
    }

}
