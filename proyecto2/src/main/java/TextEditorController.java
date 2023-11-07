import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

public class TextEditorController {

    @FXML
    private Button editButton;

    @FXML
    private Button saveButton;

    @FXML
    private TextArea textSpace;

    private Language language;

    private Stage stage;

    private Client client;

    private String fileName;

    private String fileContent;

    @FXML
    private void initialize() {
        textSpace.setEditable(false);
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setLanguage(Language language) {
        this.language = language;
        updateLanguage();
    }

    private void updateLanguage() {
        editButton.setText(language.editTButton());
        saveButton.setText(language.saveButton());
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        setContent();
    }

    private void setContent() {
        try {
            fileContent = client.getContent(fileName);
            textSpace.appendText(fileContent);
        } catch (Exception e) {
            error();
            stage.close();
        }
    }

    private void error() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(language.error());
        alert.showAndWait();
    }

    @FXML
    private void edit(ActionEvent event) {
        textSpace.setEditable(true);
    }

    @FXML
    private void save(ActionEvent event) {
        fileContent = textSpace.getText();
        try {
            client.editFile(fileName, fileContent);
            stage.close();
        } catch (Exception e) {
            error();
            stage.close();
        }
    }

}
