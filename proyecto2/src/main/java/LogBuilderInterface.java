/*Interface for the logBuilders
 * 
 * @author equipo
 */
public interface LogBuilderInterface {

    /**
     * Method that adds the corresponding file name and content to the log.
     * 
     * @param versionFileContent the content we want to add
     */
    public void addFile(String versionFileContent);

    /**
     * Method that adds the corresponding connections to the log.
     * 
     * @param connection the connection we want to add
     */
    public void addConnections(String connections);

    /**
     * Returns the log it has been building
     * 
     * @return The created log.
     */
    public Log getLog();

}
