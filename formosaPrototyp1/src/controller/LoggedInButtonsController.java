package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoggedInButtonsController extends CommonPropertiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button logout;

    @FXML
    private Button myAccount;

    @FXML
    private Button start;

    @FXML
    void handleLogoutPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_START_FXML);
    	 primaryStage.close();
		
    }

    @FXML
    void handleMyAccountPressed(ActionEvent event) {

    }

    @FXML
    void handleStartLoggedInPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_START_FXML);
    	 primaryStage.close();
		
    }

    @FXML
    void initialize() {
        assert logout != null : "fx:id=\"logout\" was not injected: check your FXML file 'LoggedInButtons.fxml'.";
        assert myAccount != null : "fx:id=\"myAccount\" was not injected: check your FXML file 'LoggedInButtons.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'LoggedInButtons.fxml'.";

    }
}
