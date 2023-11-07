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

public class ListController {

    @FXML
    private Button fileButton;

    @FXML
    private ListView<String> filesList;

    @FXML
    private Label infoLabel;

    @FXML
    private Button returnButton;

    private Language language;

    private Stage stage;

    private Client client;

    private String fileName;

    @FXML private void initialize(){
	fileButton.disableProperty().bind(filesList.getSelectionModel().selectedItemProperty().isNull());
    }

    public void setStage(Stage stage){
	this.stage = stage;
    }

    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    private void updateLanguage(){
	fileButton.setText(language.fileButton());
	infoLabel.setText(language.infoLabel());
	returnButton.setText(language.returnLButton());
    }

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

    private void error(){
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Error");
	alert.setHeaderText(null);
	alert.setContentText(language.error());
	alert.showAndWait();
    }

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

    @FXML
    private void getBack(ActionEvent event) {
	stage.close();
    }

}
