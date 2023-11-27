/**
 * Abstract class that represents a File in the directory.
 *
 * @author equipo.
 */
public abstract class FileDirectory implements VersionFile {

    private static final long serialVersionUID = 2L;
    /* The file */
    private VersionFile file;
    /* The id of the client */
    private String id;
    /* The description of the changes. */
    private String description;

    /**
     * Constructor for a FileDirectory
     */
    public FileDirectory(VersionFile file, String id, String description) {
        this.file = file;
        this.id = id;
        this.description = description;
    }

    /**
     * Getter for the name of the file 
     * 
     * @return The core file.
     */
    public String getName() {
        return file.getName();
    }

    /**
     * Getter for the content of the file encoded as String 
     * 
     * @return The content of the file as String.
     */
    public String getContent() {
        return file.getContent();
    }

    /**
     * Getter for the version
     * 
     * @return The version of the file.
     */
    public double getVersion() {
        return file.getVersion();
    }

    /**
     * Setter for the version of the file
     *
     */
    public void setVersion(double version) {
        file.setVersion(version);
    }

    /**
     * Setter for the content of the file
     *
     */
    public void setContent(String content) {
        file.setContent(content);
    }

    /**
     * String description of the changes.
     */
    private String description() {
        StringBuffer sb = new StringBuffer();
        sb.append("\nUser: "+id);
        sb.append("\nChanges: "+description);
        return sb.toString();
    }

    /**
     * toString method for a string representation of the file
     *
     * @return The string representation of the file
     */
    public String toString() {
        return file.toString() + description();
    }

}
