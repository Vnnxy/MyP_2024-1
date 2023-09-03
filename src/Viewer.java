import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class that implements observer and writes to the standard output what happens
 * during the fight.
 * 
 * @author equipo.
 */
public class Viewer implements Observer {

    /* The favorited fighter */
    private Fighter favorited;
    /* The buffer for writing */
    private BufferedWriter out;
    /* The unique id the viewer will receive */
    private String id;
    /* The fight the viewers sees */
    private Subject fight;

    /**
     * Constructor for viewer, we initialize the id, and favorited fighter.
     * 
     * @param favorited The fighter the user is supporting
     * @param username  The username of the user
     * @param arena     The arena where the fight will be happening
     */
    public Viewer(Fighter favorited, String username, Subject arena) {
        this.favorited = favorited;
        this.id = username;
        this.fight = arena;
        fight.registerObserver(this);
        try {
            FileWriter file = new FileWriter(id + ".txt");
            out = new BufferedWriter(file);
        } catch (IOException ioe) {
            System.err.printf("Writing failed");
        }
    }

    /**
     * Announces who is attacking who, also, the actions that are taking place.
     * 
     * @param event    The actions taken by the subjects.
     * @param attacker the fighter that'll be attacking, thus dealing damage.
     * @param victim   the fighter that'll be attacked, thus receiving damage.
     */
    public void announceAttack(String event, Fighter attacker, Fighter victim) {
        if (attacker == (favorited))
            log("Your chosen fighter " + event);
        else if (victim == favorited) {
            log(event);
            log("Your chosen fighter received damage");
        } else
            log(event);
    }

    /**
     * Announces and action involving a unique fighter.
     * 
     * @param event   The actions taken by the subject.
     * @param fighter the fighter that´s involved.
     */
    public void announce(String event, Fighter fighter) {
        if (fighter == (favorited))
            log("Your chosen fighter " + event);
        else
            log(event);
    }

    /**
     * Announces and event.
     * 
     * @param event The actions taken by the subject.
     */
    public void announceEvent(String event) {
        log(event);
        if (event.contains("is the winner"))
            endLog();
    }

    /**
     * Method for logging all of the events, you NEED to close it separately.
     * 
     * @param logs The messages involving the fight.
     */
    private void log(String logs) {
        try {
            out.write(logs);
            out.newLine();
        } catch (IOException ioe) {
            System.err.printf("Saving failed");
        }
    }

    /**
     * Method for closing the output.
     */
    public void endLog() {
        try {
            out.close();
        } catch (IOException ioe) {
        }
    }

}
