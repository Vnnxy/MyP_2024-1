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
    /* The name of the log */
    private final String logName = "logs";

    /** Public constructor for the server */
    public HostServer(String port) throws Exception {
        try {
            this.port = isValidPort(port);
        } catch (Exception e) {
            System.out.println("Error: port invalid, cannot initialize the server");
            throw e;
        }
        findDir();
        String dirPath = new File(dirName).getAbsolutePath();
        directory = new Directory(dirPath + "/");
    }

    /**
     * Initiates the Server by returning a ProxyDirectory where the connections will
     * happen
     * 
     * @return ProxyDirectory of the server's directory.
     */
    public void host() {
        ProxyDirectory proxy = new ProxyDirectory(directory);
        try {
            proxy.startConnection(port);
        } catch (Exception e) {
            System.out.println("Error: error in initializing the server");
        }
    }

    /**
     * Private auxiliary method to check if the port is valid.
     */
    private int isValidPort(String port) throws Exception {
        int validPort;
        try {
            validPort = Integer.parseInt(port);
        } catch (Exception e) {
            throw e;
        }
        if (validPort < 1024) {throw new Exception();} else {return validPort;}
    }

    /**
     * Private method that looks for the directory where our server will operate, if
     * it doesn't exist it creates it.
     */
    private void findDir() {
        String currentPath = System.getProperty("user.dir");
        try {
            Files.createDirectories(Paths.get(currentPath + "/" + dirName));
            Files.createDirectories(Paths.get(currentPath + "/" + logName));
        } catch (IOException ioe) {
            System.out.println("Failed to created dir");
        }
    }
}
