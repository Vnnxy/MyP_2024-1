import java.io.Serializable;

/**
 * Class for the decorator of a modified file
 *
 * @author equipo
 */
public class ModifiedFile extends FileDirectory {

    private static final long serialVersionUID = 2L;
    /**
     * Builds a modified file
     */
    public ModifiedFile(VersionFile file, String id, String description) {
        super(file,id,description);
        file.setVersion(file.getVersion()+1.0);
    }

}
