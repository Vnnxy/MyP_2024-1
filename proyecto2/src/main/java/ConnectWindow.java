import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConnectWindow extends Stage {

    private static final String FXML = "fxml/connect.fxml";

    private ConnectController controller;

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

    public boolean isAccepted() {
	return controller.isAccepted();
    }

    public String getAddress() {
	return controller.getAddress();
    }

    public int getPort() {
	return controller.getPort();
    }
}
