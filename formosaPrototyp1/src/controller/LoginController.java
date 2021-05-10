package controller;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.User;
import repository.UserRepository;

public class LoginController extends CommonPropertiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Partner;

    @FXML
    private Button start;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Button login;

    @FXML
    void handleLoginPressed(ActionEvent event) {

    	Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
List<User> users = UserRepository.readAll();
    	
    	// searching for a matching username and password
    	if(usernameTextField.getText().isEmpty() && passwordField.getText().isEmpty()) {

    		 
			
			ModalDialog dialog = new ModalDialog("Probiere nochmal");
    		Optional<ButtonType> result = dialog.showAndWait();
			if(result.isPresent()) {
    			if(result.get() == ButtonType.OK) {
    			goToScene(PATH_TO_LOGIN_FXML);
    				System.out.println("Dialog ok");
    						}
						}
	        } else {
	        
	        int i = 0;
    		for(User u : users) {
    			
    			checkUsers(u);
    			
    			if(!u.getUsername().equals(usernameTextField.getText()) && !u.getPassword().equals(passwordField.getText())) {
    						
    								++i;
    								if(i == users.size()) {
                						 
                	    				
                	    				ModalDialog dialog = new ModalDialog("Probiere es nochmal");
                	    	    		Optional<ButtonType> result = dialog.showAndWait();
                	    				if(result.isPresent()) {
                	    	    			if(result.get() == ButtonType.OK) {
                	    	    				goToScene(PATH_TO_LOGIN_FXML);
                	    	    				System.out.println("Dialog ok");
                				
                	    	    						} 
                	    							}
                								}
        									}
	        							}
	        						}
    	
    	
    	
    	 goToScene(PATH_TO_MY_ACCOUNT_FXML);
    	 primaryStage.close();
		
    }

    @FXML
    void handlePartnerPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_START_FXML);
    	 primaryStage.close();
    }

    @FXML
    void handleStartPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_PARTNER_FXML);
    	 primaryStage.close();
    }

    @FXML
    void initialize() {
        assert Partner != null : "fx:id=\"Partner\" was not injected: check your FXML file 'Login.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Login.fxml'.";
        assert passwordField != null : "fx:id=\"passwordField\" was not injected: check your FXML file 'Login.fxml'.";
        assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'Login.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Login.fxml'.";

    }
    // Login method
    public void checkUsers(User user) {
    	
    	if(user.getUsername().equals(usernameTextField.getText()) && user.getPassword().equals(passwordField.getText())) {

    	
    		selectedUser.setValue(user);
    		
    		// goes to My Account scene
    		goToScene(PATH_TO_MY_ACCOUNT_FXML);
    	}
}
  }
