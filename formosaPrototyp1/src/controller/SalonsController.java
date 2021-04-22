package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.stage.Stage;

public class SalonsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab LaruBeauty;

    @FXML
    private Tab HiltonSpa;

    @FXML
    private Tab CorleoneBarbershop;

    @FXML
    private Tab LuxBeauty;

    @FXML
    private Tab LPBeauty;

    @FXML
    private Button partner;

    @FXML
    private Button start;

    @FXML
    private Button login;

    @FXML
    private Button register;

    @FXML
    void handleCorleoneBarbershopSelected(ActionEvent event) {

    }

    @FXML
    void handleHiltonSpaSelected(ActionEvent event) {

    }

    @FXML
    void handleLPBeauty(ActionEvent event) {

    }

    @FXML
    void handleLaruBeautySelected(ActionEvent event) {

    }

    @FXML
    void handleLoginPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) login.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  hier kommt noch connection zum Datenbank
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
    void handleLuxBeautySelected(ActionEvent event) {

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
    	 *  hier kommt noch connection zum Datenbank
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
    void handleStartPressed(ActionEvent event) {
    	Stage primaryStage = (Stage) start.getScene().getWindow();
    	primaryStage.close();
    	/*
    	 *  hier kommt noch connection zum Datenbank
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
        assert LaruBeauty != null : "fx:id=\"LaruBeauty\" was not injected: check your FXML file 'Salons.fxml'.";
        assert HiltonSpa != null : "fx:id=\"HiltonSpa\" was not injected: check your FXML file 'Salons.fxml'.";
        assert CorleoneBarbershop != null : "fx:id=\"CorleoneBarbershop\" was not injected: check your FXML file 'Salons.fxml'.";
        assert LuxBeauty != null : "fx:id=\"LuxBeauty\" was not injected: check your FXML file 'Salons.fxml'.";
        assert LPBeauty != null : "fx:id=\"LPBeauty\" was not injected: check your FXML file 'Salons.fxml'.";
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'Salons.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Salons.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Salons.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'Salons.fxml'.";

    }
}
