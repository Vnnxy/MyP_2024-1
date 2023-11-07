import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TextEditorWindow extends Stage {

    private static final String FXML = "fxml/textEditor.fxml";

    private TextEditorController controller;

    public TextEditorWindow(Stage stage, Language language, Client client, String fileName) throws IOException {
	ClassLoader cl = getClass().getClassLoader();
	FXMLLoader loader = new FXMLLoader(cl.getResource(FXML));
	AnchorPane pane = (AnchorPane)loader.load();
	setTitle(language.textPane());
	initOwner(stage);
	initModality(Modality.WINDOW_MODAL);
	Scene scene = new Scene(pane);
	setScene(scene);
	controller = loader.getController();
	controller.setStage(this);
	controller.setLanguage(language);
	controller.setClient(client);
	controller.setFileName(fileName);
	setResizable(false);	
    }
}
