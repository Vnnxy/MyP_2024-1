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

/**
 * Controller for the primary view
 */
public class PrimaryController {

    /* The change mennu item*/
    @FXML
    private MenuItem changeItem;

    /* The connect menu item*/
    @FXML
    private MenuItem connectItem;

    /* The connect Menu*/
    @FXML
    private Menu connectMenu;

    /* The edit button*/
    @FXML
    private Button editButton;

    /* The exit menu*/
    @FXML
    private Menu exitMenu;

    /* The language menu*/
    @FXML
    private Menu languageMenu;

    /* The load button*/
    @FXML
    private Button loadButton;

    /*The logout menu item*/
    @FXML
    private MenuItem logoutItem;

    /*The welcome text*/
    @FXML
    private Label welcomeText;

    /* The Client*/
    private Client client;

    /* The language*/
    private Language language;

    /*The Stage*/
    private Stage stage;

    /**
     * Method to set up the controller
     *
     */
    @FXML private void initialize() {
	language = new English();
	loadButton.setDisable(true);
	editButton.setDisable(true);
	logoutItem.setDisable(true);
    }

    /**
     * Method to set the stage
     *
     * @param Stage the stage
     */
    public void setStage(Stage stage){
	this.stage = stage;
    }

    /**
     * Method to update the language
     *
     */
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

    /**
     * Method to handle the change the language menu item
     *
     * @param ActionEvent the event
     */
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
	case "Japanese":
	    this.language = new Japanese();
	    break;
	}
	updateLanguage();
    }

    /**
     * Method to show an error window
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
     * Method to handle the connect menu item
     *
     * @param ActionEvent the event
     */
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

    /**
     * Method to handle the load file button
     *
     * @param ActionEvent the event
     */
    @FXML
    private void loadFile(ActionEvent event) {
	FileChooser fc = new FileChooser();
	fc.setTitle(language.fileChooser());
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

    /**
     * Method to handle the logout menu item
     *
     * @param ActionEvent the event
     */
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

    /**
     * Method to handle the view and edit button
     *
     * @param ActionEvent the event
     */
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
