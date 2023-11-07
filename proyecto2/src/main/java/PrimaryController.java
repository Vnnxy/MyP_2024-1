import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.FileChooser;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import java.io.IOException;
import java.io.File;

public class PrimaryController {

    @FXML
    private MenuItem changeItem;

    @FXML
    private MenuItem connectItem;

    @FXML
    private Menu connectMenu;

    @FXML
    private Button editButton;

    @FXML
    private Menu exitMenu;

    @FXML
    private Menu languageMenu;

    @FXML
    private Button loadButton;

    @FXML
    private MenuItem logoutItem;

    @FXML
    private Label welcomeText;

    private Client client;

    private Language language;

    private Stage stage;

    @FXML private void initialize() {
	languague = new English();
	loadButton.setDisable(true);
	editButton.setDisable(true);
	logoutItem.setDisable(true);
    }

    public void setStage(Stage stage){
	this.stage = stage;
    }

    private void updateLanguage(){
	changeItem.setText(language.changeItem());
	connectItem.setText(language.connectItem());
	connectMenu.setText(language.connectMenu());
	editButton.setText(language.editButton());
	exitMenu.setText(language.exitMenu());
	languageMenu.setText(language.languageMenu());
	loadButton.setText(language.loadButton());
	logoutItem.setText(language.logoutItem());
	welcomeText.setText(language.welcomeText());
    }

    @FXML
    private void changeLanguage(ActionEvent event) {
	LanguageWindow window;
	try {
	    window = new LanguageWindow(stage,language);
	} catch (IOException ioe){
	    error();
	    return;
	}
	window.showAndWait();
	String l = window.getChoice();
	switch (l) {
	case "English":
	    this.language = new English();
	    break;
	case "Spanish":
	    this.language = new Spanish();
	    break;
	}
	updateLanguage();
    }

    private void error(){
	Alert alert = new Alert(AlertType.ERROR);
	alert.setTitle("Error");
	alert.setHeaderText(null);
	alert.setContentText(language.error());
	alert.showAndWait();
    }

    @FXML
    private void connect(ActionEvent event) {
	ConnectWindow window;
	try{
	    window = new ConnectWindow(stage,language);
	} catch (IOException ioe){
	    error();
	    return;
	}
	window.showAndWait();
	if(!window.isAccepted())
	    return;
	String address = window.getAddress();
	int port = window.getPort();
	try{
	    client = new Client(address,port);
	    loadButton.setDisable(false);
	    editButton.setDisable(false);
	    logoutItem.setDisable(false);
	    connectItem.setDisable(true);
	} catch(IOException ioe){
	    error();
	}
    }

    @FXML
    private void loadFile(ActionEvent event) {
	FileChooser fc = new FileChooser();
	fc.setTitle(language.fileChooser());
	fc.getExtensionFilters().addAll(new ExtensionFilter("","*.txt"));
	File file = fc.showOpenDialog(stage);
	if (file != null){
	    try{
		client.addFile(file);
	    } catch (IOException ioe){
		error();
		return;
	    }
	}
    }

    @FXML
    private void logout(ActionEvent event) {
	try{
	    client.disconnect();
	} catch (IOException ioe){}
	client = null;
	loadButton.setDisable(true);
	editButton.setDisable(true);
	logoutItem.setDisable(true);
	connectItem.setDisable(false);
    }

    @FXML
    private void viewAndEdit(ActionEvent event) {
	ListWindow window;
	try{
	    window = new ListWindow(stage,language,client);
	} catch (IOException ioe){
	    error();
	    return;
	}
	window.showAndWait();
    }

}
