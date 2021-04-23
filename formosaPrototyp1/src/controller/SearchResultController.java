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

public class SearchResultController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button partner;

    @FXML
    private Button MyAccount;

    @FXML
    private Button book;

    @FXML
    void handleBookPressed(ActionEvent event) {

    }

    @FXML
    void handleMyAccountPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) MyAccount.getScene().getWindow();
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
    void handlePartnerPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) partner.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  hier kommt noch connection zum Datenbank
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
    void initialize() {
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'SearchResult.fxml'.";
        assert MyAccount != null : "fx:id=\"MyAccount\" was not injected: check your FXML file 'SearchResult.fxml'.";
        assert book != null : "fx:id=\"book\" was not injected: check your FXML file 'SearchResult.fxml'.";

    }
}
