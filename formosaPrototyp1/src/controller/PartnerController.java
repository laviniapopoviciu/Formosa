package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PartnerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button start;

    @FXML
    private ImageView email;

    @FXML
    void handleEmailClicked(MouseEvent event) {

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
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Partner.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'Partner.fxml'.";

    }
}
