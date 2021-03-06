package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class MyAccountController extends CommonPropertiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button saveInfo;

    @FXML
    private Button deleteAccount;

    @FXML
    private Button logout;

    @FXML
    private Button partner;

    @FXML
    private Button start;

    @FXML
    void handleDeleteAccount(ActionEvent event) {

    }

    @FXML
    void handleLogoutPressed(ActionEvent event) {

    }

    @FXML
    void handlePartnerPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_PARTNER_FXML);
    	 primaryStage.close();
		
    }
    

  
 public void handleSaveInfo() {
	// show DataSavedDialog data saved

	 
	 

			UserDataChangedDialog dialog = new UserDataChangedDialog();
			Optional<ButtonType> result = dialog.showAndWait();
			if(result.isPresent()) {
				if(result.get() == ButtonType.OK) {
					System.out.println("This");
				} else {
					System.out.println("That");
				}
			}
			
	

				
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
        assert saveInfo != null : "fx:id=\"saveInfo\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert deleteAccount != null : "fx:id=\"deleteAccount\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert logout != null : "fx:id=\"logout\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'MyAccount.fxml'.";

    }
}
