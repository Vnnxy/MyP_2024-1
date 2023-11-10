import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class representing the EventLogBuilder that will create our Log.
 * 
 * @author equipo
 */
public class EventLogBuilder implements LogBuilderInterface {

    /* The ArrayList containing the connections of the Server and Client */
    private ArrayList<String> connections = new ArrayList<>();
    /* The HashMap containing the Requests and changes made by the Client */
    private HashMap<Integer, String> fileHistory = new HashMap<>();
    /* A counter for the requests */
    private int requestNumber = 1;
    /* Log type */
    private final String logType = "EventLog";

    /**
     * Method that adds the corresponding file name and content to the log.
     * 
     * @param versionFileContent the content we want to add
     */
    public void addFile(String versionFileContent) {
        fileHistory.put(requestNumber, versionFileContent);
        requestNumber++;
    }

    /**
     * Method that adds the corresponding connections to the log.
     * 
     * @param connection the connection we want to add
     */
    public void addConnections(String connection) {
        java.util.Date date = new java.util.Date();
        connections.add(connection + " at " + date);
    }

    /**
     * Returns the log it has been building
     * 
     * @return The created log.
     */
    public Log getLog() {
        return new Log(connections, fileHistory, logType);
    }

}
