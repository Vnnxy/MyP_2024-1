import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ConnectController {

    @FXML
    private Label addressLabel;

    @FXML
    private TextField addressText;

    @FXML
    private Button connectButton;

    @FXML
    private Label portLabel;

    @FXML
    private TextField portText;

    @FXML
    private Button returnButton;

    private Language language;

    private Stage stage;

    private boolean accepted;

    private String address;

    private int port;

    @FXML private void initialize(){
	connectButton.setDisable(true);
	addressText.textProperty().addListener((o,v,n) -> verify(n));
	portText.textProperty().addListener((o,v,n) -> verify(n));
	addressText.requestFocus();
    }

    private void verify(String n){
	if (n.equals(""))
	    connectButton.setDisable(true);
	else
	    connectButton.setDisable(false);
    }

    @FXML
    private void cancel(ActionEvent event) {
	accepted = false;
	stage.close();
    }

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

    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    public String getAddress() {
	return address;
    }

    public int getPort() {
	return port;
    }

    private void updateLanguage(){
	addressLabel.setText(language.addressLabel());
	connectButton.setText(language.connectButton());
	portLabel.setText(language.portLabel());
	returnButton.setText(language.returnButton());
    }

    public void setStage(Stage stage){
	this.stage = stage;
    }

    public boolean isAccepted(){
	return accepted;
    }
}
