import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Class to build a List file Window
 */
public class ListWindow extends Stage {

    /* The FXML*/
    private static final String FXML = "fxml/list.fxml";

    /* The controller*/
    private ListController controller;

    /**
     * Method to build a new window
     *
     * @param Stage the stage
     * @param Language the lannguage
     * @param Client the client
     */
    public ListWindow(Stage stage, Language language, Client client) throws IOException {
	ClassLoader cl = getClass().getClassLoader();
	FXMLLoader loader = new FXMLLoader(cl.getResource(FXML));
	AnchorPane pane = (AnchorPane)loader.load();
	setTitle(language.listPane());
	initOwner(stage);
	initModality(Modality.WINDOW_MODAL);
	Scene scene = new Scene(pane);
	setScene(scene);
	controller = loader.getController();
	controller.setStage(this);
	controller.setLanguage(language);
	controller.setClient(client);
	setResizable(false);	
    }
}
