import java.util.ArrayList;

/**
 * Class that represents the adapter for CheemsSoldado. (Uncle Sam is proud of
 * you :))
 *
 * @author equipo.
 */
public class CheemsListensToUncleSam implements Soldier {

    /* The cheems we will be adaptding */
    private CheemsSoldado cheems;

    /* The id of the captain */
    private String id;
    /* The formation of the battalion. */
    private String formation;
    /* The damage points of the captain. */
    private double dps;
    /* The speed points of the captain. */
    private double speed;
    /* The defense points of the captain. */
    private double defense;
    /* The gear the soldier will be using. */
    private String gear;
    /* The list of subordinates under Cheems if applicable. */
    private ArrayList<Soldier> subordinates;
    /* Boolean representing if cheems is a captain */
    private boolean isCaptain = false;
    /* Boolean representing if cheems is a lieutenant */
    private boolean isLieutenant = false;

    /**
     * Build a new cheems adaptator
     *
     * @param id         the id for cheems.
     * @param cheems     the instance of cheems that we will be adapting
     * @param captain    boolean to know if it is a captain
     * @param lieutenant boolean to know if it is a lieutenant
     */
    public CheemsListensToUncleSam(boolean captain, boolean lieutenant, String id,
            String formation) {
	CuartelCheems cuartel = new CuartelCheems();
	this.cheems = cuartel.desplegarCheems();
	this.cheems.activarReliquias();
        if (captain && !lieutenant) {
            isCaptain = true;
            subordinates = new ArrayList<Soldier>();
        } else if (!captain && lieutenant) {
            isLieutenant = true;
            subordinates = new ArrayList<Soldier>();
        }
        this.id = id;
        this.formation = formation;
        dps = this.cheems.getAtaqueMagico();
        speed = this.cheems.getMovimientoMagico();
        defense = this.cheems.getDefensaMagica();
	gear ="";
    }

    /**
     * Method that returns the soldier´s battle formation.
     * 
     * @return String the formation
     */
    @Override
    public String getFormation() {
        return formation;
    }

    /**
     * Method that returns the soldier´s id.
     * 
     * @return String the id.
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Method that returns the soldier´s damage points.
     * 
     * @return double damage points
     */
    @Override
    public double getDp() {
        return dps;
    }

    /**
     * Method that sets the soldier´s damage points.
     * 
     * @param double dp representing damage points
     */
    @Override
    public void setDp(double dp) {
        this.dps = dp;
    }

    /**
     * Method that returns the soldier´s speed.
     * 
     * @return double speed.
     */
    @Override
    public double getSpeed() {
        return speed;
    }

    /**
     * Method that sets the soldier´s speed points.
     * 
     * @param double speed representing speed points
     */
    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Method that returns the soldier´s defense points.
     * 
     * @return double defense points
     */
    @Override
    public double getDefense() {
        return defense;
    }

    /**
     * Method that sets the soldier´s defense points.
     * 
     * @param double defense representing defense points
     */
    @Override
    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * Method that sets the soldier´s gear.
     * 
     * @param gear representing gear.
     */
    @Override
    public void setGear(String gear) {
        this.gear = gear;
    }

    /**
     * Method that returns a String representation of the soldier´s gear.
     * 
     */
    @Override
    public String getGear() {
        return gear;
    }

    /**
     * Method that checks if the soldier is a captain.
     *
     * @return true if the soldier is a captain, false otherwise.
     */
    @Override
    public boolean isCaptain() {
        return isCaptain;
    }

    /**
     * Method that checks if the soldier is a lieutenant.
     *
     * @return true if the soldier is a lieutenant, false otherwise.
     */
    @Override
    public boolean isLieutenant() {
        return isLieutenant;
    }

    /**
     * Method that sets if the soldier is a captain.
     *
     * @param boolean true if the soldier is a captain, false otherwise.
     */
    public void setIsCaptain(boolean isCaptain) {
        if (!this.isCaptain && isCaptain) {
            subordinates = new ArrayList<Soldier>();
        }
        this.isCaptain = isCaptain;
    }

    /**
     * Method that sets if the soldier is a lieutenant.
     *
     * @param boolean true if the soldier is a lieutenant, false otherwise.
     */
    public void setIsLieutenant(boolean isLieutenant) {
        if (!this.isLieutenant && isLieutenant)
            subordinates = new ArrayList<Soldier>();
        this.isLieutenant = isLieutenant;
    }

    /**
     * Method that checks if the Iron Cheems has been used.
     *
     * @return true if Iron Cheems has been used, false otherwise.
     */
    @Override
    public boolean hasIronCheemsBeenUsed() {
        return false;
    }

    /**
     * Method to give a report of the battalion.
     *
     */
    @Override
    public void report() {
        System.out.println(this.toString());
        if (isCaptain || isLieutenant) {
            for (Soldier soldier : subordinates)
                soldier.report();
        }
    }

    /**
     * Method to relay an order to the battalion under the lieutenant.
     * 
     * @param oder the order
     */
    @Override
    public void relayOrder(String order) {
        if (!isCaptain && !isLieutenant) {
            System.out.println("A private can't order anything");
            return;
        } else if (isCaptain)
            this.formation = order;
        for (Soldier subordinate : subordinates)
            subordinate.receiveOrder(order);

    }

    /**
     * Method to receive an order from the lieutenant.
     * 
     * @param order the orde
     */
    @Override
    public void receiveOrder(String order) {
        if (isCaptain) {
            System.out.println("A captain can't receive orders");
            return;
        } else if (isLieutenant) {
            relayOrder(order);
        }
        this.formation = order;
    }

    /**
     * Method to add a soldier to the battallion under the lieutenant.
     *
     * @param soldier the soldier to add.
     */
    @Override
    public void addSoldier(Soldier soldier) {
        if (!isCaptain && !isLieutenant) {
            System.out.println("A Private does not have any soldiers");
            return;
        } else if (isCaptain && !soldier.isLieutenant()) {
            System.out.println("A captain can only receive lieutenants");
            return;
        } else if (isLieutenant && soldier.isCaptain() || soldier.isLieutenant()) {
            System.out.println("A Lieutenat only has Privates under control");
            return;
        }
        subordinates.add(soldier);

    }

    /**
     * Method that returns the soldier´s full report.
     * 
     * @return String
     */
    @Override
    public String toString() {
        String tabs = "\n\t\t";
        String rank = "Private ";
        StringBuffer information = new StringBuffer();
        if (isLieutenant) {
            tabs = "\n\t";
            rank = "Lieutenant ";
        } else if (isCaptain) {
            tabs = "\n";
            rank = "Captain ";
        }
        information.append(tabs + rank);
        information.append(tabs + "Cheems: ").append(id);
        information.append(tabs + "Battalion formation: ").append(formation);
        information.append(tabs + "Damage with some magic: ").append(String.format("%.2f",dps));
        information.append(tabs + "Defense with some magic: ").append(String.format("%.2f",defense));
        information.append(tabs + "Speed with some magic: ").append(String.format("%.2f",speed));
        information.append(tabs + "Gear and relics: ").append(gear);
	String[] array = this.cheems.mostrarReliquias().split("\n");
	for (String s : array)
	    information.append(tabs +s);
        return information.toString();
    }
}
