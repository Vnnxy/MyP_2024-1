import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;

import javafx.scene.shape.Path;

public class Log {

    private final String changeLog = "ChangeLog";
    private final String serverLog = "ServerLog";
    private final String eventLog = "EventLog";

    private void write(String logType, String content) {
        String currentPath = System.getProperty("user.dir");
        String dirName = currentPath + "/logs";
        String fileName = logType + ".txt";
        File actualFile = new File(dirName, fileName);
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(actualFile));
            output.write(content);
            output.close();
        } catch (IOException ioe) {
        }
    }

    public void buildChangeLog(LogBuilder logBuilder) {
        logBuilder.setLog(changeLog);
        logBuilder.setConnection();
        write(changeLog, logBuilder.toString());
    }

    public void buildServerLog(LogBuilder logBuilder) {
        logBuilder.setLog(serverLog);
        logBuilder.setFiles();
        write(serverLog, logBuilder.toString());
    }

    public void buildEventLog(LogBuilder logBuilder) {
        logBuilder.setLog(eventLog);
        logBuilder.setConnection();
        logBuilder.setFiles();
        write(eventLog, logBuilder.toString());
    }

}
