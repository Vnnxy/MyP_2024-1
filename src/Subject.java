/**
 * Interface for the subject where we will be notifying the audience.
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
     */
    public void notifyAttack(String event, Fighter fighter);

    /**
     * Notifies the defenses being donde by the fighter
     * 
     * @param event   The events/actions the fighter takes.
     * @param fighter The fighter taking the actions.
     */
    public void notifyDefense(String event, Fighter fighter);
}
