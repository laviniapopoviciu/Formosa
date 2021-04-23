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

public class RegisterController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createAccount;

    @FXML
    private Button start;

    @FXML
    private Button partner;

    @FXML
    private Button login;

    @FXML
    void handleCreateAccount(ActionEvent event) {
    	Stage primaryStage = (Stage) createAccount.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  hier kommt noch connection zum Datenbank
    	 * 
    	 */
    	
    
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/MyAccount.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
	 
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load MyAccount");
			e.printStackTrace();
		}
    }

    @FXML
    void handleLoginPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) login.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Login.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
	 
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Login");
			e.printStackTrace();
		}
    }

    @FXML
    void handlePartnerPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) partner.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Partner.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
  
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Partner");
			e.printStackTrace();
		}
    }

    @FXML
    void handleStartPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) start.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Start.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
  
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Start");
			e.printStackTrace();
		}
    }

    @FXML
    void initialize() {
        assert createAccount != null : "fx:id=\"createAccount\" was not injected: check your FXML file 'Register.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Register.fxml'.";
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'Register.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Register.fxml'.";

    }
}
