import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Class that builds the language window
 */
public class LanguageWindow extends Stage {

    /* The FXMl*/
    private static final String FXML = "fxml/language.fxml";

    /* The controller*/
    private LanguageController controller;

    /**
     * Method to create the window 
     * 
     * @param Stage the stage
     * @param Language the language
     */
    public LanguageWindow(Stage stage, Language language) throws IOException {
	ClassLoader cl = getClass().getClassLoader();
	FXMLLoader loader = new FXMLLoader(cl.getResource(FXML));
	AnchorPane pane = (AnchorPane)loader.load();
	setTitle(language.languagePane());
	initStyle(StageStyle.UNDECORATED);
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
     * Method to get the selected language
     * 
     * @return String the choice
     */
    public String getChoice(){
	return controller.getChoice();
    }
}
