package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import at.wifiwien.javaswe.strawberry_fields.controller.GameEndedDialog;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class MyAccountController {

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

  
 public void handleSaveInfo(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
	// show DataSavedDialog only if data saved
//			if (newValue == true) {
//				
//				String dialogInfo = "";
//				if (game.getWinner().isPresent()) {
//					// Winner
//					String winnerName = game.getWinner().map((w) -> w.getName()).orElse("Error: no winner");
//					dialogInfo = winnerName + " " + resources.getString("winsMessage");
//					
//				} else {
//					// Draw
//					dialogInfo = resources.getString("drawMessage");
//				}
//				
//				String dialogHeader = resources.getString("gameEnded");
//				GameEndedDialog dialog = new GameEndedDialog(dialogHeader, dialogInfo);
//				
				// show dialog and wait for answer  
//				Optional<ButtonType> result = dialog.showAndWait();
//				if (result.isPresent()) {
//					if (result.get() == ButtonType.OK) {
//						System.out.println("Dialog ok");
//					} else {
//						System.out.println("Dialog cancel");
//					}
//				}

				
			}
			
    

    @FXML
    void handleStartLoggedInPressed(ActionEvent event) {
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
        assert saveInfo != null : "fx:id=\"saveInfo\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert deleteAccount != null : "fx:id=\"deleteAccount\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert logout != null : "fx:id=\"logout\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'MyAccount.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'MyAccount.fxml'.";

    }
}