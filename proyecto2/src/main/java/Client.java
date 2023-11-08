import java.io.*;
import java.net.Socket;
import java.util.Iterator;
import java.util.ArrayList;

public class Client {

    /* The socket for the connection */
    private Socket socket;
    /* The output stream for the socket */
    ObjectOutputStream obs;
    /* The output stream for the socket */
    ObjectInputStream ois;

    /**
     * Constructor for a client
     */
    public Client(String ip, int port) throws IOException {
        startConnection(ip, port);
    }

    /**
     * Method that starts the connection
     * 
     * @param ip   The ip address we will be using.
     * @param port The port of the server.
     * @throws Exception
     */
    private void startConnection(String ip, int port) throws IOException {
        socket = new Socket(ip, port);
        obs = new ObjectOutputStream(socket.getOutputStream());
        obs.flush();
        ois = new ObjectInputStream(socket.getInputStream());
    }

    /**
     * Method to add a file, sending the proper request to the server and then the
     * file.
     * 
     * @param file The new file we want to add.
     * @throws Exception
     */
    public void addFile(File file) throws IOException {
        String filename = file.getName();
        String content = getContent(file);
        CoreFile cFile = new CoreFile(filename, content);
        obs.writeObject(Protocol.SAVE);
        obs.writeObject(cFile);
    }

    /**
     * Method to modify/edit a file.
     * 
     * @param filename The name of the file we are modifying.
     * @param content  The content of the modified file.
     * @throws Exception
     */
    public void editFile(String filename, String content) throws IOException {
        obs.writeObject(Protocol.REQUEST_FILE);
        obs.writeObject(filename);
        ModifiedFile modified = null;
        try {
            java.util.Date date = new java.util.Date();
            modified = new ModifiedFile((VersionFile) ois.readObject(), "Client", "at" + date);
        } catch (Exception e) {
        }
        modified.setContent(content);
        obs.writeObject(Protocol.MODIFY);
        obs.writeObject(modified);
    }

    /**
     * Getter to retrieve files from the directory.
     * 
     * @param filename The name of the desired file.
     * @return The file that mathches the name
     * @throws Exception If the file is not found or an IO Exception occurs.
     */
    public String getContent(String filename) throws IOException {
        obs.writeObject(Protocol.REQUEST_FILE);
        obs.writeObject(filename);
        VersionFile file = null;
        try {
            file = (VersionFile) ois.readObject();
        } catch (Exception ioe) {
        }
        return file.getContent();
    }

    /**
     * Getter for the filenames in the directory.
     * 
     * @return The filenames.
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public ArrayList<String> getFiles() throws Exception {
        obs.writeObject(Protocol.REQUEST_FILES);
        return (ArrayList<String>) ois.readObject();
    }

    /**
     * Ends the connections by closing de streams and sockets.
     */
    public void disconnect() throws IOException {
        obs.writeObject(Protocol.END_CONNECTION);
        obs.flush();
        obs.close();
        ois.close();
        socket.close();
    }

    /**
     * Auxiliary method that reads the file's content and converts it into a String
     * representation
     * 
     * @param file The file we ant to get the content from.
     * @return String representation of the content
     */
    private String getContent(File file) throws IOException {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(file));
            StringBuffer content = new StringBuffer();
            String line = bReader.readLine();
            while (line != null) {
                content.append(line);
                content.append(System.lineSeparator());
                line = bReader.readLine();
            }
            bReader.close();
            return content.toString();
        } catch (FileNotFoundException fne) {
        } catch (IOException ioe) {
            throw ioe;
        }
        return "";

    }
}
