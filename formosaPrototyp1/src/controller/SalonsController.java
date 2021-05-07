package controller;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class SalonsController extends CommonPropertiesController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

   
    @FXML
    private Button partner;

    @FXML
    private Button start;

    @FXML
    private Button login;

    @FXML
    private Button register;
    
    @FXML
    private TabPane salonTabPane;

  
    @FXML
    private Label label;

    @FXML
    private Button button;
    
    @FXML
    private TabPane tabPane;
    
    

    @FXML
    void buttonPressed(ActionEvent event) {
    	label.setText("Button was pressed");
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
    void handleLuxBeautySelected(ActionEvent event) {

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
    void handleRegisterPressed(ActionEvent event) {
Stage primaryStage = (Stage) start.getScene().getWindow();
    	
    	/*
    	 *  
    	 * 
    	 */
    	
    	
    	 goToScene(PATH_TO_REGISTER_FXML);
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
 
        assert partner != null : "fx:id=\"partner\" was not injected: check your FXML file 'Salons.fxml'.";
        assert start != null : "fx:id=\"start\" was not injected: check your FXML file 'Salons.fxml'.";
        assert login != null : "fx:id=\"login\" was not injected: check your FXML file 'Salons.fxml'.";
        assert register != null : "fx:id=\"register\" was not injected: check your FXML file 'Salons.fxml'.";

//        button.setText("New");
//    	
//    	
//    	for (model.Salon s : salonListFromDatabase) {
//    	FXMLLoader loader = new FXMLLoader();
//    	loader.setLocation(getClass().getResource("/fxml/tab.fxml"));
//    	Parent root = loader.load();
//    	
//    	Tab tab = new Tab("LaruBeauty", root);
//    	Tab tab1 = new Tab("DonCorleone Barbershop", root);
//    	
//    	
//   	tabPane.getChildrenUnmodifiable();
//    	}
//    	     
//    
//        
//      Tab selectedTab = tabPane.getSelectionModel().getSelectedItem();
    }
}
