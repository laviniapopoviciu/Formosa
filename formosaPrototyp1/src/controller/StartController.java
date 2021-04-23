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
    void handleRegisterPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) register.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Register.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Register");
			e.printStackTrace();
		}
    }

    @FXML
    void handleSalonsPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) salons.getScene().getWindow(); //schimba denumirea primaryStage in altceva
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Salons.fxml"));

			Parent root = (Parent) loader.load();

			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Salons");
			e.printStackTrace();
		}
    }

    @FXML
    void handleSearchPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) search.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	// berechne searchResults
    	
    	// speichere searchResults in CPC
    	
    	try { // Hier wird die zweite Fenster geöffnet

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/SearchResult.fxml"));

			Parent root = (Parent) loader.load();
			//SearchResultController controller = loader.getController();
			
			//controller.setSearchResults();
			
			
			 
													
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setScene(scene);
			
			//stage.setOnHidden(e -> primaryStage.show()); // in plus
			
			stage.show();
			
			primaryStage.hide(); // dazu
			
		} catch (Exception e) {
			System.err.println("Cannot load Search Results");
			e.printStackTrace();
		}
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
