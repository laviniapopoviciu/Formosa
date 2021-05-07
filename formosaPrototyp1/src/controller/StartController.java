package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button partner;

    @FXML
    private Button login;

    @FXML
    private Button register;

    @FXML
    private Button salons;

    @FXML
    private Button search;

    @FXML
    void handleLoginPressed(ActionEvent event) {
Stage primaryStage = (Stage) login.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_LOGIN_FXML);
    	 primaryStage.close();
		
    }
    

    @FXML
    void handlePartnerPressed(ActionEvent event) {
Stage primaryStage = (Stage) partner.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_PARTNER_FXML);
    	 primaryStage.close();
		
    }

    @FXML
    void handleRegisterPressed(ActionEvent event) {
Stage primaryStage = (Stage) register.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_REGISTER_FXML);
    	 primaryStage.close();
		
    }
    @FXML
    void handleSalonsPressed(ActionEvent event) {
Stage primaryStage = (Stage) salons.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_SALONS_FXML);
    	 primaryStage.close();
		
    }
    @FXML
    void handleSearchPressed(ActionEvent event) {
Stage primaryStage = (Stage) search.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_SEARCH_RESULT_FXML);
    	 primaryStage.close();
		
    }

    @FXML
    void initialize() {
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'Start.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Start.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'Start.fxml'.";
        assert salons != null : "fx:id=\"salons\" was not injected: check your FXML file 'Start.fxml'.";
        assert search != null : "fx:id=\"search\" was not injected: check your FXML file 'Start.fxml'.";

    }
}
