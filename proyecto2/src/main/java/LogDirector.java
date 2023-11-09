import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for the director that will decide wich log it will create.
 */
public class LogDirector {

    /* The name of the ChangeLog */
    private final String changeLog = "ChangeLog";
    /* The name of the ServerLog */
    private final String serverLog = "ServerLog";
    /* The name of the EventLog */
    private final String eventLog = "EventLog";
    /* The log it will use */
    private Log log;

    /**
     * Public constructor for the director
     * 
     * @param log The log it will be using
     */
    public LogDirector(Log log) {
        this.log = log;
    }

    /**
     * Private method that writes the desired file in the specified directory.
     * 
     * @param logType The name of the file
     * @param content The content of the file
     */
    private void write(String logType, String content) {
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

    /**
     * Creates the ServerLog.
     */
    public void buildServerLog() {
        log.setConnection(true);
        write(serverLog, serverLog + "\n" + log.toString());
        log.reset();
    }

    /**
     * Creates the ChangeLog
     */
    public void buildChangeLog() {
        log.setFiles(true);
        write(changeLog, changeLog + "\n" + log.toString());
        log.reset();
    }

    /**
     * Creates the EventLog
     */
    public void buildEventLog() {
        log.setConnection(true);
        log.setFiles(true);
        write(eventLog, eventLog + "\n" + log.toString());
        log.reset();
    }

}
