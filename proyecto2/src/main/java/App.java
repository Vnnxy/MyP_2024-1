import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Class that sets the application.
 * 
 * @author equipo.
 */
public class App extends Application {
    /* The primary fxml route*/
    private static final String GUI = "fxml/primary.fxml";

    /**
     * method that starts the application.
     *
     * @param stage  the Stage.
     */
    @Override public void start(Stage stage) throws Exception {
	ClassLoader cl = getClass().getClassLoader();
	stage.setTitle("Project 2");
	FXMLLoader loader;
	loader = new FXMLLoader(cl.getResource(GUI));
	AnchorPane pane = (AnchorPane)loader.load();
	PrimaryController controller = loader.getController();
	controller.setStage(stage);
	Scene scene = new Scene(pane);
	stage.setScene(scene);
	stage.show();
    }
}
