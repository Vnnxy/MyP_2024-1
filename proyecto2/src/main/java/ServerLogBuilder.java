import java.util.ArrayList;

/**
 * Class representing the ServerLogBuilder that will create our ServerLog.
 * 
 * @author equipo
 */
public class ServerLogBuilder implements LogBuilderInterface {

    /* The ArrayList containing the connections of the Server and Client */
    private ArrayList<String> connections = new ArrayList<>();
    /* Log type */
    private final String logType = "ServerLog";

    /**
     * Method that adds the corresponding file name and content to the log.
     * 
     * @param versionFileContent the content we want to add
     */
    public void addFile(String versionFileContent) {

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
        return new Log(connections, logType);
    }

}
