import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class representing the Log we will have.
 * 
 * @author equipo
 */
public class Log {

    /* The ArrayList containing the connections of the Server and Client */
    private ArrayList<String> connections = new ArrayList<>();
    /* The HashMap containing the Requests and changes made by the Client */
    private HashMap<Integer, String> fileHistory = new HashMap<>();
    /* Boolean that determines the to string */
    private boolean connection = false;
    /* Boolean that determines the to string */
    private boolean files = false;
    /* A counter for the requests */
    private int requestNumber = 1;

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
     * Methpd that adds a connection to the ArrayList. It concatenates the date of
     * the connection.
     * 
     * @param connection The Connection made by the client/server
     */
    public void addConnections(String connection) {
        java.util.Date date = new java.util.Date();
        connections.add(connection + " at " + date);
    }

    /**
     * Setter for the connection boolean
     * 
     * @param hasConnections true if the logType requires the connections
     *                       representation, false otherwise.
     */
    public void setConnection(boolean hasConnections) {
        connection = hasConnections;
    }

    /**
     * Setter for the connection boolean
     * 
     * @param hasFiles true if the logType requires the files
     *                 representation, false otherwise.
     */
    public void setFiles(boolean hasFiles) {
        files = hasFiles;
    }

    /**
     * Resets the booleans to false.
     */
    public void reset() {
        files = false;
        connection = false;
    }

    /**
     * Method that formats and turns into a string by parsing each element of the
     * data structures.
     * 
     * @return String representation of the log.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (connection != false) {
            for (String s : connections) {
                sb.append(s + " ");
                sb.append("\n");
            }
        }
        if (files != false) {
            fileHistory.forEach((key, value) -> sb.append("Request # " + key + ":" + value + "\n"));
        }
        return sb.toString();
    }

}
