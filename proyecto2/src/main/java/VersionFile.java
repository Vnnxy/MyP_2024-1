import java.io.Serializable;

/**
 * Interface to indetify files.
 */
public interface VersionFile extends Serializable {

    /**
     * Getter for the name of the file 
     * 
     * @return The core file.
     */
    public String getName();

    /**
     * Getter for the content of the file encoded as String 
     * 
     * @return The content of the file as String.
     */
    public String getContent();

    /**
     * Getter for the version
     * 
     * @return The version of the file.
     */
    public double getVersion();

    /**
     * Setter for the version of the file
     *
     */
    public void setVersion(double version);

    /**
     * Setter for the content of the file
     *
     */
    public void setContent(String content);


    /**
     * toString method for a string representation of the file
     *
     * @return The string representation of the file
     */
    public String toString();
}
