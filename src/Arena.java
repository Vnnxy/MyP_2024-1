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
    Fighter dittuu;
    /* List of Observers */
    ArrayList<Observer> observers;

    /**
     * Constructor for Arena.
     * 
     * @param korby    Our fighter named korby
     * @param meganman Our fighter named meganman
     */
    public Arena(Korby korby, MeganMan meganman) {
        observers = new ArrayList<>();
        this.korby = korby;
        this.meganman = meganman;
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

    private void newAttack(Fighter a, Fighter v) {
        String event = a.attack(v);
        notifyAttack(event, a, v);
        if (!(v.isAlive()))
            notifyAction(v.toString() + " is dead", v);
    }

    private void newDefense(Fighter a) {
        String event = a.defend();
        notifyAction(event, a);
    }

    private void stopDefense(Fighter a) {
        a.stopDefense();
        notifyAction(a.toString() + " stopped defending", a);
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight1() {
        newAttack(korby, meganman);
        newAttack(korby, meganman);
        newAttack(korby, meganman);
        newDefense(korby);
        stopDefense(korby);
        KorbyFood sword = new Sword();
        notifyEvent("A new " + sword.toString() + " appeared");
        String s = korby.transform(sword);
        notifyAction(s, korby);
        newAttack(korby, meganman);
        notifyAction("Korby is the winner!", korby);
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight2() {
    }

    /**
     * The simulation of a fight.
     * 
     */
    public void fight3() {
    }

}
