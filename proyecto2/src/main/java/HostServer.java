import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Class for the host machine. This will contain the directory.
 *
 * @autor equipo.
 */
public class HostServer {

    /* The directory of the server */
    private Directory directory;
    /* The name of the directory */
    private final String dirName = "drive";
    /* The port where the socket will be initialized. */
    private int port;

    /** Public constructor for the server */
    public HostServer(int port) {
        this.port = port;
        findDir();
        String dirPath = new File(dirName).getAbsolutePath();
        directory = new Directory(dirPath+"/");
    }

    /**
     * Initiates the Server by returning a ProxyDirectory where the connections will
     * happen
     * 
     * @return ProxyDirectory of the server's directory.
     */
    public void host() throws Exception {
        ProxyDirectory proxy = new ProxyDirectory(directory);
        proxy.startConnection(port);
    }

    /**
     * Private method that looks for the directory where our server will operate, if
     * it doesn't exist it creates it.
     */
    private void findDir() {
        String currentPath = System.getProperty("user.dir");
        try {
            System.out.println(Paths.get(currentPath + "/" + dirName));
            Files.createDirectories(Paths.get(currentPath + "/" + dirName));
        } catch (IOException ioe) {
            System.out.println("Failed to created dir");
        }
    }
}
