import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * Crontroller of the language selection window
 */
public class LanguageController {

    /* The accept button*/
    @FXML
    private Button languageButton;

    /* The choice box of the languages*/
    @FXML
    private ChoiceBox<String> languageChoice;

    /* The label*/
    @FXML
    private Label languageLabel;

    /* The language*/
    private Language language;

    /*The stage*/
    private Stage stage;

    /* The language choice*/
    private String choice;

    /**
     * Method that sets up the interface 
     * 
     */
    @FXML private void initialize() {
	String[] l = {"English","Spanish", "Japanese"};
	languageChoice.getItems().addAll(l);
	languageChoice.setValue("English");
	languageChoice.requestFocus();
	languageButton.setDisable(false);
    }

    /**
     * Method to set Language 
     * 
     * @param Language the language
     */
    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    /**
     * Method to update the Language 
     * 
     */
    private void updateLanguage(){
	languageButton.setText(language.languageButton());
	languageLabel.setText(language.languageLabel());
    }

    /**
     * Method to handle the accept button 
     * 
     * @param ActionEvent the event
     */
    @FXML
    private void accept(ActionEvent event) {
	this.choice = languageChoice.getValue();
	stage.close();
    }

    /**
     * Method to get the language choice 
     * 
     * @return String the String
     */
    public String getChoice(){
	return this.choice;
    }

    /**
     * Method to set the Stage 
     * 
     * @param Stage the stage
     */
    public void setStage(Stage stage){
	this.stage = stage;
    }

}
