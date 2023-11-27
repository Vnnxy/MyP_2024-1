import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;

/**
 * Controller for text editor view
 */
public class TextEditorController {

    /* The edit button*/
    @FXML
    private Button editButton;

    /* The save button*/
    @FXML
    private Button saveButton;

    /* The text space*/
    @FXML
    private TextArea textSpace;

    /* the language*/
    private Language language;

    /* The Stage*/
    private Stage stage;

    /* The client*/
    private Client client;

    /* The file name*/
    private String fileName;

    /* The file content*/
    private String fileContent;

    /**
     * Method to set up the controller
     *
     */
    @FXML
    private void initialize() {
        textSpace.setEditable(false);
    }

    /**
     * Method to set stage
     *
     * @param Stage the stage
     */
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /**
     * Method to set the language
     *
     * @param Language the language
     */
    public void setLanguage(Language language) {
        this.language = language;
        updateLanguage();
    }

    /**
     * Method to update the language
     *
     */
    private void updateLanguage() {
        editButton.setText(language.editTButton());
        saveButton.setText(language.saveButton());
    }

    /**
     * Method to set the client
     *
     * @param Client the client
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * Method to set the file name
     *
     * @param String the file name
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
        setContent();
    }

    /**
     * Method to set the file contnent
     *
     */
    private void setContent() {
        try {
            fileContent = client.getContent(fileName);
            textSpace.appendText(fileContent);
        } catch (Exception e) {
            error();
            stage.close();
        }
    }

    /**
     * Method to show an error window
     *
     */
    private void error() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(language.error());
        alert.showAndWait();
    }

    /**
     * Method to handle the edit button
     *
     * @param Actionevent the event
     */
    @FXML
    private void edit(ActionEvent event) {
        textSpace.setEditable(true);
    }

    /**
     * Method to handle the save button
     *
     * @param ActionEvent the event
     */
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
