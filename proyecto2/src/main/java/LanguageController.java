import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class LanguageController {

    @FXML
    private Button languageButton;

    @FXML
    private ChoiceBox<String> languageChoice;

    @FXML
    private Label languageLabel;

    private Language language;

    private Stage stage;

    private String choice;

    @FXML private void initialize() {
	String[] l = {"English","Spanish"};
	languageChoice.getItems().addAll(l);
	languageChoice.setValue("English");
	languageChoice.requestFoocus();
	languageButton.setDisable(false);
    }

    public void setLanguage(Language language){
	this.language = language;
	updateLanguage();
    }

    private void updateLanguage(){
	languageButton.setText(language.languageButton());
	languageLabel.setText(language.languageLabel());
    }
    
    @FXML
    private void accept(ActionEvent event) {
	this.choice = languageChoice.getValue();
	stage.close();
    }

    public String getChoice(){
	return this.choice;
    }

    public void setStage(Stage stage){
	this.stage = stage;
    }

}
