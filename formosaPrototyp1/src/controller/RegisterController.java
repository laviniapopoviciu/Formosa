package controller;

import java.net.URL;
import java.util.ListIterator;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.ListChangeListener;
import javafx.collections.ListChangeListener.Change;
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
import model.Account;
import model.User;
import model.YearList;
import repository.UserRepository;

public class RegisterController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createAccount;
    
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private PasswordField confirmPasswordTextField;
    
    @FXML
    private Button start;

    @FXML
    private Button partner;

    @FXML
    private Button login;

    @FXML
    void handleCreateAccount(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();

//create variables and check if the data is correct and create account

String username = usernameTextField.getText();
String firstName = firstNameTextField.getText();
String lastName = lastNameTextField.getText();
String email = emailTextField.getText();
String password = passwordTextField.getText();
String confirmPassword = confirmPasswordTextField.getText();
 

if(!username.isEmpty()  && !firstName.isEmpty() && !lastName.isEmpty() && !email.isEmpty() && !password.isEmpty() && password.equals(confirmPassword)){
	User newUser = new User(0l,username, firstName, lastName, email, password);
	
 
	// Adding the new User
	userList.add(newUser);
	UserRepository.add(newUser);
	
	System.out.println(userList);
		
		 
				
				 
				
				
				 goToScene(PATH_TO_MY_ACCOUNT_FXML);
				
				 primaryStage.close();
			} else {
				System.out.println("Cannot create user");
			}
		

		
    }

    @FXML
    void handleLoginPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_LOGIN_FXML);
    	 primaryStage.close();
		
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

    @FXML
    void handleStartPressed(ActionEvent event) {
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
    	   assert createAccount != null : "fx:id=\"createAccount\" was not injected: check your FXML file 'Register.fxml'.";
           assert usernameTextField != null : "fx:id=\"usernameTextField\" was not injected: check your FXML file 'Register.fxml'.";
           assert firstNameTextField != null : "fx:id=\"firstNameTextField\" was not injected: check your FXML file 'Register.fxml'.";
           assert lastNameTextField != null : "fx:id=\"lastNameTextField\" was not injected: check your FXML file 'Register.fxml'.";
           assert emailTextField != null : "fx:id=\"emailTextField\" was not injected: check your FXML file 'Register.fxml'.";
           assert passwordTextField != null : "fx:id=\"passwordTextField\" was not injected: check your FXML file 'Register.fxml'.";
           assert confirmPasswordTextField != null : "fx:id=\"confirmPasswordTextField\" was not injected: check your FXML file 'Register.fxml'.";
	        assert createAccount != null : "fx:id=\"createAccount\" was not injected: check your FXML file 'Register.fxml'.";
	        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Register.fxml'.";
	        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'Register.fxml'.";
	        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Register.fxml'.";

	      
    }
}
