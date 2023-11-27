import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Class that creates a new connect window
 *
 */
public class ConnectWindow extends Stage {

    /*The FXML*/
    private static final String FXML = "fxml/connect.fxml";

    /*The FXMLs controller*/
    private ConnectController controller;

    /**
     * Method that builds the window
     * 
     * @param stage The Stage
     * @param language the language
     * 
     */
    public ConnectWindow(Stage stage, Language language) throws IOException {
	ClassLoader cl = getClass().getClassLoader();
	FXMLLoader loader = new FXMLLoader(cl.getResource(FXML));
	AnchorPane pane = (AnchorPane)loader.load();
	setTitle(language.connectPane());
	initOwner(stage);
	initModality(Modality.WINDOW_MODAL);
	Scene scene = new Scene(pane);
	setScene(scene);
	controller = loader.getController();
	controller.setStage(this);
	controller.setLanguage(language);
	setResizable(false);	
    }

    /**
     * Method to get the accepted value
     * 
     * @return boolean the value
     */
    public boolean isAccepted() {
	return controller.isAccepted();
    }

    /**
     * Method to get the address 
     * 
     * @return String the address
     */
    public String getAddress() {
	return controller.getAddress();
    }

    /**
     * Method to get the port 
     * 
     * @return int the port
     */
    public int getPort() {
	return controller.getPort();
    }
}
