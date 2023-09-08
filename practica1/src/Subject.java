/**
 * Interface for the subject where we will be notifying the audience.
 * @author equipo.
 */
public interface Subject {

    /**
     * Registers a new observer.
     * 
     * @param observer The observer we will be registering.
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer.
     * 
     * @param observer The observer we will be removing.
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies the attacks being donde by the fighter.
     * 
     * @param event   The events/actions the fighter takes.
     * @param fighter The fighter taking the actions.
     * @param victim The fighter which was attacked
     */
    public void notifyAttack(String event, Fighter fighter, Fighter victim);

    /**
     * Notifies an action being donde by a unique fighter
     * 
     * @param event   The events/actions the fighter takes.
     * @param fighter The fighter taking the actions.
     */
    public void notifyAction(String event, Fighter fighter);

    /**
     * Notifies an event.
     * 
     * @param event   The events.
     */
    public void notifyEvent(String event);
    
}
