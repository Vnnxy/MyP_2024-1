import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class representing the Log we will have.
 * 
 * @author equipo
 */
public class Log {

    /* The ArrayList containing the connections of the Server and Client */
    private ArrayList<String> connections = null;
    /* The HashMap containing the Requests and changes made by the Client */
    private HashMap<Integer, String> fileHistory = null;
    /* The logType */
    private String logType;

    /**
     * Public constructor for the Log class.
     * 
     * @param connections The connections made by the server.
     * @param fileHistory The Changes made to files.
     * @param logType     The name of the LogFile.
     */
    public Log(ArrayList<String> connections, HashMap<Integer, String> fileHistory, String logType) {
        this.connections = connections;
        this.fileHistory = fileHistory;
        this.logType = logType;
    }

    /**
     * Public constructor for the Log class.
     * 
     * @param connections The connections made by the server.
     * @param logType     The name of the LogFile.
     */
    public Log(ArrayList<String> connections, String logType) {
        this.connections = connections;
        this.logType = logType;
    }

    /**
     * Public constructor for the Log class.
     * 
     * @param fileHistory The Changes made to files.
     * @param logType     The name of the LogFile.
     */
    public Log(HashMap<Integer, String> fileHistory, String logType) {
        this.fileHistory = fileHistory;
        this.logType = logType;
    }

    /**
     * Method that formats and turns into a string by parsing each element of the
     * data structures. This method also invokes the private method @link{write},
     * writing the buffer into a file.
     * 
     * @return String representation of the log.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        if (logType.equals("ServerLog") || logType.equals("EventLog")) {
            for (String s : connections) {
                sb.append(s + " ");
                sb.append("\n");
            }
        }
        if (logType.equals("ChangeLog") || logType.equals("EventLog")) {
            fileHistory.forEach((key, value) -> sb.append("Request # " + key + ":" + value + "\n"));
        }
        write(sb.toString());
        return sb.toString();
    }

    /**
     * Method that writes the desired file in the specified directory.
     * 
     * @param logType The name of the file
     * @param content The content of the file
     */
    private void write(String content) {
        String currentPath = System.getProperty("user.dir");
        String dirName = currentPath + "/logs";
        String fileName = logType + ".txt";
        File actualFile = new File(dirName, fileName);
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(actualFile));
            output.write(content);
            output.close();
        } catch (IOException ioe) {
        }
    }

}
