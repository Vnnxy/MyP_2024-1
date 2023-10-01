public class DeathStar extends StarForge {

    InterGalactic engine = new InterGalactic();
    Fortress armor = new Fortress();
    PlanetDestroyer weapon = new PlanetDestroyer();
    Army cabin = new Army();

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
