
/**
 * Class representing the LogBuilder that will create our Log.
 * 
 * @author equipo
 */
public class LogBuilder implements LogBuilderInterface {

    /* The log that will be built. */
    private Log log;

    /* Constructor for the class */
    public LogBuilder() {
        this.log = new Log();
    }

    /**
     * Method that adds the corresponding file name and content to the log.
     * 
     * @param versionFileContent the content we want to add
     */
    public void addFile(String versionFileContent) {
        log.addFile(versionFileContent);
    }

    /**
     * Method that adds the corresponding connections to the log.
     * 
     * @param connection the connection we want to add
     */
    public void addConnections(String connection) {
        log.addConnections(connection);
    }

    /**
     * Returns the log it has been building
     * 
     * @return The created log.
     */
    public Log getLog() {
        return log;
    }

}
