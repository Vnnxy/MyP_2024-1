import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import java.io.IOException;
import java.util.*;

/**
 * The Controller for the List of files view
 */
public class ListController {

    /*THe accept button*/
    @FXML
    private Button fileButton;

    /* The files List*/
    @FXML
    private ListView<String> filesList;

    /* The info label*/
    @FXML
    private Label infoLabel;

    /* The return button*/
    @FXML
    private Button returnButton;

    /* The Language*/
    private Language language;

    /* The stage*/
    private Stage stage;

    /* The client*/
    private Client client;

    /* The file name*/
    private String fileName;

    /**
     * Method to set up the controller
     *
     */
    @FXML private void initialize(){
	fileButton.disableProperty().bind(filesList.getSelectionModel().selectedItemProperty().isNull());
    }

    /**
     * Method to set the Stage
     *
     * @param Stage the stage
     */
    public void setStage(Stage stage){
	this.stage = stage;
    }

    /**
     * Method to set the Language
     *
     * @param Language the language
     */
    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    /**
     * Method to update the language
     *
     */
    private void updateLanguage(){
	fileButton.setText(language.fileButton());
	infoLabel.setText(language.infoLabel());
	returnButton.setText(language.returnLButton());
    }

    /**
     * Method to set the Client
     *
     * @param Client the client
     */
    public void setClient(Client client){
	this.client = client;
	try{
	    ArrayList<String> items = client.getFiles();
	    filesList.getItems().addAll(items);
	}
	catch (Exception e){
	    error();
	    stage.close();
	}
    }

    /**
     * Method to show an error view
     *
     */
    private void error(){
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Error");
	alert.setHeaderText(null);
	alert.setContentText(language.error());
	alert.showAndWait();
    }

    /**
     * Method to handle the accept button
     *
     * @param ActionEvent the event
     */
    @FXML
    private void fileSelected(ActionEvent event) {
	fileName = filesList.getSelectionModel().getSelectedItem();
	TextEditorWindow window = null;
	try{
	    window = new TextEditorWindow(stage,language,client,fileName);
	} catch (IOException ioe){
	    error();
	    stage.close();
	}
	window.showAndWait();
	stage.close();
    }

    /**
     * Method to handle the return button
     *
     * @param ActionEvent the event
     */
    @FXML
    private void getBack(ActionEvent event) {
	stage.close();
    }

}
