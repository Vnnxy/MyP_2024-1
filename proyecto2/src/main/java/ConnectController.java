import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Method that starts the connection.
 * @author equipo.
 *
 */
public class ConnectController {

    /*The label*/
    @FXML
    private Label addressLabel;

    /* the text address*/
    @FXML
    private TextField addressText;

    /* the connect Button*/
    @FXML
    private Button connectButton;

    /*The port Label*/
    @FXML
    private Label portLabel;

    /* The port text field*/
    @FXML
    private TextField portText;

    /* The return button*/
    @FXML
    private Button returnButton;

    /* the language*/
    private Language language;

    /* The stage*/
    private Stage stage;

    /* boolean that represents wheter the view is accepted*/
    private boolean accepted;

    /*The address*/
    private String address;

    /* The port*/
    private int port;

     /**
     * Method that initialize the controller
     * 
     */
    @FXML private void initialize(){
	connectButton.setDisable(true);
	addressText.textProperty().addListener((o,v,n) -> verify(n));
	portText.textProperty().addListener((o,v,n) -> verify(n));
	addressText.requestFocus();
    }
    
     /**
     * Private Method that verifies the texts fields
     * 
     * @param n The String
     */
    private void verify(String n){
	if (n.equals(""))
	    connectButton.setDisable(true);
	else
	    connectButton.setDisable(false);
    }

     /**
     * Method that handles the button cancel
     * 
     * @param ActionEvent the event
     */
    @FXML
    private void cancel(ActionEvent event) {
	accepted = false;
	stage.close();
    }
    
    /**
     * Method that handles the connect button
     * 
     * @param ActionEvent the event
     */
    @FXML
    private void connect(ActionEvent event) {
	try{
	    this.address = addressText.getText();
	    this.port = Integer.parseInt(portText.getText());
	    this.accepted = true;
	    stage.close();
	} catch (NumberFormatException nfe){
	    return;
	}
    }

    /**
     * Method to set the language
     * 
     * @param Language the language
     */
    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    /**
     * Method to get the Address
     * 
     * @return String the address
     */
    public String getAddress() {
	return address;
    }

    /**
     * Method to get the port
     * 
     * @return int the port
     */
    public int getPort() {
	return port;
    }

    /**
     * Method to update the language 
     * 
     */
    private void updateLanguage(){
	addressLabel.setText(language.addressLabel());
	connectButton.setText(language.connectButton());
	portLabel.setText(language.portLabel());
	returnButton.setText(language.returnButton());
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
     * Method to get whether the window is accepted 
     * 
     * @return boolean the accepted value
     */
    public boolean isAccepted(){
	return accepted;
    }
}
