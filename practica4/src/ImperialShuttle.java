public class ImperialShuttle extends StarForge {

    InterPlanetary engine = new InterPlanetary();
    Reinforced armor = new Reinforced();
    PlasmaBlaster weapon = new PlasmaBlaster();
    SmallCrew cabin = new SmallCrew();

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
