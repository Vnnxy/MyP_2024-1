import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CoreFile implements VersionFile {

    private static final long serialVersionUID = 2L;
    /* The name of the file */
    private String name;
    /* The content of the file */
    private String content;
    /* The version of the file */
    private double version;

    /**
     * Public constructor for a core file
     */
    public CoreFile(String name, String content) {
        this.name = name;
        this.content = content;
        this.version = 0.0;
    }

    /**
     * Getter for the name of the file
     *
     * @return name The name of the file
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the content of the file encoded as String 
     * 
     * @return The string codification of the file.
     */
    public String getContent() {
        return content;
    }

    /**
     * Getter for the version
     * 
     * @return The version of the file.
     */
    public double getVersion() {
        return version;
    }

    /**
     * Setter for the version of the file
     *
     */
    public void setVersion(double version) {
        this.version = version;
    }

    /**
     * Setter for the content of the file
     *
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * toString method for a string representation of the file
     *
     * @return The string representation of the file
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Name: "+name);
        sb.append("\nVersion: "+version);
        return sb.toString();
    }
}
