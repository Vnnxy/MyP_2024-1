import java.util.ArrayList;

/**
 * Class for the arena where the fights will take place.
 * 
 * @author equipo.
 */
public class Arena implements Subject {

    /* The fighter kirby */
    Korby korby;
    /* The fighter meganman */
    MeganMan meganman;
    /* The fighter dittuu */
    Dittuu dittuu;
    /* List of Observers */
    ArrayList<Observer> observers;

    /**
     * Constructor for Arena.
     * 
     * @param korby    Our fighter named korby
     * @param meganman Our fighter named meganman
     */
    public Arena(Korby korby, MeganMan meganman, Dittuu dittuu) {
        observers = new ArrayList<>();
        this.korby = korby;
        this.meganman = meganman;
        this.dittuu = dittuu;
    }

    /**
     * Registers a new observer.
     * 
     * @param observer The observer we will be registering.
     */
    public void registerObserver(Observer observer) {
        boolean b = observers.add(observer);
    }

    /**
     * Removes an observer.
     * 
     * @param observer The observer we will be removing.
     */
    public void removeObserver(Observer observer) {
        boolean b = observers.remove(observer);
    }

    /**
     * Notifies the attacks being donde by the fighter.
     * 
     * @param event   The events/actions the fighter takes.
     * @param fighter The fighter taking the actions.
     * @param victim  The fighter which was attacked
     */
    public void notifyAttack(String event, Fighter fighter, Fighter victim) {
        for (Observer observer : observers) {
            observer.announceAttack(event, fighter, victim);
        }
    }

    /**
     * Notifies an action being donde by a unique fighter
     * 
     * @param event   The events/actions the fighter takes.
     * @param fighter The fighter taking the actions.
     */
    public void notifyAction(String event, Fighter fighter) {
        for (Observer observer : observers) {
            observer.announce(event, fighter);
        }
    }

    /**
     * Notifies an event.
     * 
     * @param event The events.
     */
    public void notifyEvent(String event) {
        for (Observer observer : observers) {
            observer.announceEvent(event);
        }
    }

    /**
     * Private method where a fighter attacks, notifies the observers
     * @param a The attackant
     * @param v The victim of the attack
     */
    private void newAttack(Fighter a, Fighter v) {
        String event = a.attack(v);
        notifyAttack(event, a, v);
        if (!(v.isAlive()))
            notifyAction(v.toString() + " is dead", v);
    }

    /**
     * Private method where a fighter defends, notifies the observers
     * @param a The fighter
     */
    private void newDefense(Fighter a) {
        String event = a.defend();
        notifyAction(event, a);
    }

    /**
     * Private method where a fighter stops defending, notifies the observers
     * @param a The fighter
     */
    private void stopDefense(Fighter a) {
        a.stopDefense();
        notifyAction(a.toString() + " stopped defending", a);
    }

    /**
     * Private method to notify the appearance of a new item
     * @param event the name of the item
     */
    private void newAppearance(String event){
	notifyEvent("A new " + event  + " appeared");
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight1() {
	notifyEvent("The fight begins");
        newAttack(korby, meganman);
        newAttack(korby, meganman);
	newAttack(meganman,dittuu);
        newAttack(korby, meganman);
        newDefense(korby);
	newDefense(dittuu);
        stopDefense(korby);
        KorbyFood sword = new Sword();
	newAppearance(sword.toString());
        String s = korby.transform(sword);
        notifyAction(s, korby);
	DittuuTransformation espion = new Espion();
	newAppearance(espion.toString());
        newAttack(korby, meganman);
	s = dittuu.transform(espion);
	notifyAction(s,dittuu);
	newAttack(korby,dittuu);
	newAttack(korby,dittuu);
	KorbyFood car = new Car();
	newAppearance(car.toString());
        s = korby.transform(car);
        notifyAction(s, korby);
	newAttack(dittuu,korby);
	newAttack(korby,dittuu);
	newAttack(korby,dittuu);
	newDefense(korby);
	newAttack(dittuu,korby);
	newAttack(korby,dittuu);
	newAttack(korby,dittuu);
	notifyAction("Korby is the winner!", korby);
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight2() {
	notifyEvent("The fight begins");
        newAttack(korby, meganman);
	newAttack(meganman,dittuu);
	MeganManTransformation jet = new JetMan();
	newAppearance(jet.toString());
        String s = meganman.transform(jet);
        notifyAction(s, meganman);
        newAttack( meganman,korby);
        newDefense(korby);
	newDefense(dittuu);
	newAttack(meganman,dittuu);
        newAttack(korby, meganman);
	KorbyFood cone = new Cone();
	newAppearance(cone.toString());
        s = korby.transform(cone);
        notifyAction(s, korby);
	newDefense(meganman);
	newAttack(meganman,dittuu);
	newAttack(meganman,korby);
	stopDefense(korby);
	newAttack(meganman,dittuu);
	newAttack(meganman,korby);
	newAttack(meganman,korby);
	notifyAction("MeganMan is the winner!", meganman);
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight3() {
	notifyEvent("The fight begins");
	newAttack(meganman,dittuu);
	MeganManTransformation diamond = new DiamondIce();
	newAppearance(diamond.toString());
        String s = meganman.transform(diamond);
        notifyAction(s, meganman);
        newAttack(meganman,korby);
	DittuuTransformation miu = new Miu();
	newAppearance(miu.toString());
        newAttack(korby, meganman);
	s = dittuu.transform(miu);
	notifyAction(s,dittuu);
        newDefense(korby);
	newAttack(dittuu,korby);
	MeganManTransformation absolute = new AbsoluteZero();
	newAppearance(absolute.toString());
        newAttack(dittuu,korby);
	s = meganman.transform(absolute);
	notifyAction(s, meganman);
	newDefense(meganman);
	newAttack(dittuu,meganman);
	DittuuTransformation wulu = new Wulu();
	newAppearance(wulu.toString());
	s = dittuu.transform(wulu);
	notifyAction(s,dittuu);
	newAttack(dittuu,meganman);
	notifyAction("Dittuu is the winner!", dittuu);
	
    }

}
