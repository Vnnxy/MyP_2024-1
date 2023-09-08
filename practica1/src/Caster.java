/**
 * Class that implements observer and writes to the standard output what happens during the fight.
 *  @author equipo.
 */
public class Caster implements Observer {

    /* The fight the caster sees*/
    private Subject fight;

    public Caster(Subject arena){
	this.fight = arena;
	fight.registerObserver(this);
    }
    
    /**
     * Announces who is attacking who, also, the actions that are taking place.
     * 
     * @param event    The actions taken by the subjects.
     * @param attacker the fighter that'll be attacking, thus dealing damage.
     * @param victim   the fighter that'll be attacked, thus receiving damage.
     */
    public void announceAttack(String event, Fighter attacker, Fighter victim){
	System.out.println(event);
    }

    /**
     * Announces and action involving a unique fighter.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that´s involved.
     */
    public void announce(String event, Fighter fighter){
	System.out.println(event);
    }

    /**
     * Announces and event.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that´s involved.
     */
    public void announceEvent(String event){
	System.out.println(event);
    }

}
