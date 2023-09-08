/**
 * Interface for the observer where we will be notifying the actions taken by
 * the characters.
 * @author equipo.
 */

public interface Observer {

    /**
     * Announces who is attacking who, also, the actions that are taking place.
     * 
     * @param event    The actions taken by the subjects.
     * @param attacker the fighter that'll be attacking, thus dealing damage.
     * @param victim   the fighter that'll be attacked, thus receiving damage.
     */
    public void announceAttack(String event, Fighter attacker, Fighter victim);

    /**
     * Announces and action involving a unique fighter.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that´s involved.
     */
    public void announce(String event, Fighter fighter);

    /**
     * Announces and event.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that´s involved.
     */
    public void announceEvent(String event);

}
