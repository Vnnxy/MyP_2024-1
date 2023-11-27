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
    /* The socket that conects with the client */
    private Socket clientSocket;

    /* the event log builder */
    private EventLogBuilder eventLogBuilder = new EventLogBuilder();
    /* the server log builder */
    private ServerLogBuilder serverLogBuilder = new ServerLogBuilder();
    /* the change log builder */
    private ChangeLogBuilder changeLogBuilder = new ChangeLogBuilder();

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
    private void returnFile(String filename, ObjectOutputStream obs) {
        try {
            VersionFile file = getFile(filename);
            obs.writeObject(file);
        } catch (Exception e) {
            System.out.println("Failed to return the file");
        }
    }

    /**
     * Method to add a file to the directory
     *
     * @param file The file to save in the directory
     */
    public void addFile(VersionFile file) {
        try {
            directory.addFile(file);
        } catch (Exception e) {
            System.out.println("Error: failed to save a file in the directory");
        }
    }

    /**
     * Method to modify a file of the directory
     *
     * @param file The file to save in the directory
     */
    public void modifyFile(VersionFile file) {
        try {
            directory.modifyFile(file);
        } catch (Exception e) {
            System.out.println("Error: failed to modify a file");
        }
    }

    /**
     * Private method to return the iterator of the
     * directory through the socket using an ArrayList
     */
    private void returnFiles(ObjectOutputStream obs) {
        Iterator<String> iter = directory.iterator();
        ArrayList<String> files = new ArrayList<>();
        while (iter.hasNext()) {
            String filename = iter.next();
            files.add(filename);
        }
        try {
            obs.writeObject(files);
        } catch (IOException ioe) {
            System.out.println("Error: failed to send the files to the client");
        }
    }

    /**
     * Creates and starts the server
     */
    public void startConnection(int port) throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                System.out.println("Waiting connections...");
                clientSocket = serverSocket.accept();
                serverLogBuilder.addConnections("CLIENT CONNECTED");
                eventLogBuilder.addConnections("CLIENT CONNECTED");
                handleClientConnection();
            }
        }
    }

    /**
     * Auxiliar method to handre the client request
     */
    private void handleClientConnection() {
        System.out.println("Client connected");
        try {
            ObjectOutputStream obs = new ObjectOutputStream(clientSocket.getOutputStream());
            obs.flush();
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
            while (!clientSocket.isClosed()) {
                identifyRequest(ois, obs);
            }
        } catch (Exception e) {
            System.out.println("Error: client disconnected");
            serverLogBuilder.addConnections("Error: error in the connection between the client and the server");
            eventLogBuilder.addConnections("Error: error in the connection between the client and the server");
            serverLogBuilder.getLog().toString();
            eventLogBuilder.getLog().toString();
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
                String requestText = request.toString() + "" + file.toString();
                changeLogBuilder.addFile(requestText);
                eventLogBuilder.addFile(requestText);
                break;
            }
            case MODIFY: {
                VersionFile file = (VersionFile) ois.readObject();
                modifyFile(file);
                String requestText = request.toString() + "" + file.toString();
                changeLogBuilder.addFile(requestText);
                eventLogBuilder.addFile(requestText);
                break;
            }
            case REQUEST_FILE: {
                String filename = (String) ois.readObject();
                returnFile(filename, obs);
                String requestText = request + " " + filename;
                changeLogBuilder.addFile(requestText);
                eventLogBuilder.addFile(requestText);
                break;
            }
            case REQUEST_FILES: {
                returnFiles(obs);
                changeLogBuilder.addFile(request.toString());
                eventLogBuilder.addFile(request.toString());
                break;
            }
            case END_CONNECTION: {
                disconnect();
                eventLogBuilder.addConnections(request.toString());
                serverLogBuilder.addConnections(request.toString());
                eventLogBuilder.getLog().toString();
                serverLogBuilder.getLog().toString();
                changeLogBuilder.getLog().toString();
                break;
            }
            default:
                System.out.println("Error: message not in the protocol");
        }
    }

    /**
     * Ends the connections by closing de streams and sockets.
     */
    public void disconnect() {
        try {
            clientSocket.close();
            System.out.println("Client disconnected");
        } catch (IOException ioe) {
        }
    }

}
