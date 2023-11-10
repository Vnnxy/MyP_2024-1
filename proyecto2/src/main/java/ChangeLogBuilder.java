import java.util.HashMap;

/**
 * Class representing the ChangeLogBuilder that will create our Log.
 * 
 * @author equipo
 */
public class ChangeLogBuilder implements LogBuilderInterface {

    /* The HashMap containing the Requests and changes made by the Client */
    private HashMap<Integer, String> fileHistory = new HashMap<>();
    /* A counter for the requests */
    private int requestNumber = 1;
    /* Log type */
    private final String logType = "ChangeLog";

    /**
     * Method that adds a file to the hashMap and it maps it to the request number.
     * 
     * @param versionFileContent The content and request
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
    }

    /**
     * Returns the log it has been building
     * 
     * @return The created log.
     */
    public Log getLog() {
        return new Log(fileHistory, logType);
    }

}
