public class DeathStar extends StarForge {

    private Components engine;
    private Components armor;
    private Components weapon;
    private Components cabin;

    public DeathStar() {
	this.engine = new InterGalactic();
	this.armor = new Fortress();
	this.weapon = new PlanetDestroyer();
	this.cabin = new Army();
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
	return "The Death Star has defined its components";
    }

}
