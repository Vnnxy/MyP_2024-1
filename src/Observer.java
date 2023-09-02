/**
 * Interface for the observer where we will be notifying the actions taken by
 * the characters.
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
     * Announces who is defending itself.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that'll be defending, thus reducing damage.
     */
    public void announceDefense(String event, Fighter fighter);

}
