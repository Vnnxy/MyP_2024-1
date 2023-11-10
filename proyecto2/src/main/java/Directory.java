import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.HashMap;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Class to traverse, modify, return and add
 * files to the drive
 * Note: this only works in Unix filesystems
 *
 * @autor equipo.
 */
public class Directory implements DirectoryInterface {

    /**
     * The hashmap containing the files encoded as a String
     * mapped to their filename.
     */
    private HashMap<String, VersionFile> files;
    /* The absolute path of the drive */
    private final String drivePath;

    /**
     * Public constructor for a directory
     * 
     * @param drivePath The path of the drive directory.
     */
    public Directory(String drivePath) {
        files = new HashMap<>();
        this.drivePath = drivePath;
        addFilenames();
    }

    /**
     * Public getter for the drive path
     * 
     * @return the path where the drive directory is located.
     */
    public String getPath() {
        return drivePath;
    }

    /**
     * Private method to add each filename of the directory in the hashmap.
     * We use try-with resources statement with the walk API to ensure that
     * the resource of the stream closes at the end of the statement
     */
    private void addFilenames() {
        try (Stream<Path> paths = Files.walk(Paths.get(drivePath))) {
            paths.filter(Files::isRegularFile)
                    .forEach(file -> {
                        String filename = getFilename(file.toString());
                        files.put(filename, new CoreFile(filename, ""));
                    });
        } catch (IOException ioe) {
            System.out.println("Error: failed to read files of the directory");
        }
    }

    /**
     * Private method to split the path and get only the name of the file.
     */
    private String getFilename(String path) {
        String[] splittedPath = path.split("/");
        return splittedPath[splittedPath.length - 1];
    }

    /**
     * Private method to map a file encoded as a string
     * to their respective filename.
     */
    private void mapFile(String filename) throws IOException {
        String filePath = drivePath + filename;
        String content = Files.readString(Paths.get(filePath));
        files.get(filename).setContent(content);
    }

    /**
     * Method to return a given file encoded as a String
     *
     * @param filename the given file
     * @return the file encoded as a String
     */
    public VersionFile getFile(String filename) throws Exception {
        VersionFile file = files.get(filename);
        if (file != null) {
            if (file.getContent() == "")
                mapFile(filename);
            return file;
        } else {
            throw new Exception();
        }
    }

    /**
     * Method to add a file to the directory
     *
     * @param file The file to save in the directory
     */
    public void addFile(VersionFile file) throws Exception {
        if (file == null)
            throw new Exception();
        files.put(file.getName(), file);
        saveFile(file);
    }

    /**
     * Private method to write a file in the directory.
     */
    private void saveFile(VersionFile file) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(drivePath + file.getName()))) {
            bw.write(file.getContent());
        }
    }

    /**
     * Method to modify a file of the directory
     *
     * @param file The file to save in the directory
     */
    public void modifyFile(VersionFile file) throws Exception {
        VersionFile replace = files.replace(file.getName(), file);
        if (replace == null)
            throw new Exception();
        saveFile(file);
    }

    /**
     * Returns an iterator over the files of the directory
     *
     * @return Iterator of the directory
     */
    public Iterator<String> iterator() {
        return files.keySet().iterator();
    }
}
