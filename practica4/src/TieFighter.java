public class TieFighter extends StarForge {

    InterContinental engine = new InterContinental();
    Simple armor = new Simple();
    SimpleLaser weapon = new SimpleLaser();
    Individual cabin = new Individual();

    public void addJetEngine(JetEngine engine) {
        parts.add(this.engine);
    }

    public void addArmor(Armor armor) {
        parts.add(this.armor);
    }

    public void addWeapon(Weapons weapon) {
        parts.add(this.weapon);
    }

    public void addCabin(Cabin cabin) {
        parts.add(this.cabin);
    }

}
