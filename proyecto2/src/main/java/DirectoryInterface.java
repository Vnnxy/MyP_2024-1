/**
 * Interface that represents a Directory.
 *
 * @author equipo.
 */
public interface DirectoryInterface  {

    /**
     * Method to return a given file encoded as a String
     *
     * @param filename the given file
     * @return the file encoded as a String
     */
    public VersionFile getFile(String filename) throws Exception;

    /**
     * Method to add a file to the directory
     *
     * @param filename the name of the file to add
     * @param file the file contents encoded as a string
     */
    public void addFile(VersionFile file) throws Exception;

    /**
     * Method to modify a file of the directory
     *
     * @param filename the name of the file modified
     * @param newFile the contents of the new file
     */
    public void modifyFile(VersionFile file) throws Exception; 
}
