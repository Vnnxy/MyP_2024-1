import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Class representing the directory.
 *
 * @author equipo.
 */
public class ProxyDirectory implements DirectoryInterface {

    /* The directory the client will be interacting with */
    private Directory directory;
    /* The server */
    private ServerSocket serverSocket;
    /* The socket that conects with the client */
    private Socket clientSocket;
    /* The ip address of the server the directory is located */
    private String ip;

    private Log log = new Log();

    private LogBuilder logBuilder = new LogBuilder();

    /**
     * Constructor of the proxy.
     */
    public ProxyDirectory(Directory directory) {
        this.directory = directory;
    }

    /**
     * Method to return a file given a filename
     *
     * @param filename the given file
     */
    public VersionFile getFile(String filename) throws Exception {
        return directory.getFile(filename);
    }

    /**
     * Private method to return the file through the socket
     */
    private void returnFile(String filename, ObjectOutputStream obs) throws Exception {
        VersionFile file = getFile(filename);
        obs.writeObject(file);
    }

    /**
     * Method to add a file to the directory
     *
     * @param file The file to save in the directory
     */
    public void addFile(VersionFile file) throws Exception {
        directory.addFile(file);
    }

    /**
     * Method to modify a file of the directory
     *
     * @param file The file to save in the directory
     */
    public void modifyFile(VersionFile file) throws Exception {
        directory.modifyFile(file);
    }

    /**
     * Returns an iterator over the files of the directory
     *
     * @return Iterator of the directory
     */
    public Iterator<String> iterator() {
        return directory.iterator();
    }

    /**
     * Private method to return the iterator of the
     * directory through the socket
     */
    private void returnFiles(ObjectOutputStream obs) {
        Iterator<String> iter = iterator();
        ArrayList<String> files = new ArrayList<>();
        while (iter.hasNext()) {
            String filename = iter.next();
            files.add(filename);
        }
        try {
            obs.writeObject(files);
        } catch (IOException ioe) {
        }
    }

    /**
     * Creates and starts the server
     */
    public void startConnection(int port) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                System.out.println("Esperando conexiones");
                clientSocket = serverSocket.accept();
                logBuilder.addConnections("CLIENT CONNECTED");
                handleClientConnection();
            }
        }
    }

    /**
     * Auxiliar method to handre the client request
     */
    private void handleClientConnection() throws Exception {
        System.out.println("Cliente conectado");
        ObjectOutputStream obs = new ObjectOutputStream(clientSocket.getOutputStream());
        obs.flush();
        ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        while (!clientSocket.isClosed()) {
            identifyRequest(ois, obs);
        }
    }

    /**
     * Private method to identify the request.
     */
    private void identifyRequest(ObjectInputStream ois, ObjectOutputStream obs) throws Exception {
        Protocol request = (Protocol) ois.readObject();
        switch (request) {
            case SAVE: {
                VersionFile file = (VersionFile) ois.readObject();
                addFile(file);
                logBuilder.addFile(request, file.toString());
                break;
            }
            case MODIFY: {
                VersionFile file = (VersionFile) ois.readObject();
                modifyFile(file);
                logBuilder.addFile(request, file.toString());
                break;
            }
            case REQUEST_FILE: {
                String filename = (String) ois.readObject();
                returnFile(filename, obs);
                logBuilder.addFile(request, "Requested File:" + filename);
                break;
            }
            case REQUEST_FILES: {
                returnFiles(obs);
                logBuilder.addFile(request, "");
                break;
            }
            case END_CONNECTION: {
                disconnect();
                logBuilder.addConnections(request.toString());
                log.buildChangeLog(logBuilder);
                log.buildEventLog(logBuilder);
                log.buildServerLog(logBuilder);
                break;
            }
            default:
                System.out.println("Error: la opcion no existe");
        }
    }

    /**
     * Ends the connections by closing de streams and sockets.
     */
    public void disconnect() {
        try {
            clientSocket.close();
            System.out.println("Cliente desconectado");
        } catch (IOException ioe) {
        }
    }

}
