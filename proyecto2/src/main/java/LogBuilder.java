import java.util.ArrayList;
import java.util.HashMap;

public class LogBuilder implements LogBuilderInterface {

    private ArrayList<String> connections = new ArrayList<>();
    private HashMap<Protocol, String> fileHistory = new HashMap<>();
    private String logType = "";
    boolean connection = false;
    boolean files = false;

    public void setConnection() {
        this.connection = true;
    }

    public void setFiles() {
        this.files = true;
    }

    public void addFile(Protocol protocol, String versionFileContent) {
        fileHistory.put(protocol, versionFileContent);
    }

    public void setFileMap(HashMap<Protocol, String> fileHistory) {
        this.fileHistory = fileHistory;
    }

    public void addConnections(String connection) {
        java.util.Date date = new java.util.Date();
        connections.add(connection + "at" + date);
    }

    public void setConnectionList(ArrayList<String> connectionList) {
        this.connections = connectionList;
    }

    public void setLog(String logType) {
        this.logType = logType;
    }

    public String getlogType() {
        return logType;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(logType);
        if (connection != false) {
            for (String s : connections) {
                sb.append(s);
                sb.append("\n");
            }
        }
        if (files != false) {
            fileHistory.forEach((key, value) -> sb.append(key + ":" + value + "\n"));
        }
        return sb.toString();
    }

}
