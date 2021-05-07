package controller;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import repository.UserRepository;
import repository.UserRepositoryJPA;

public class CommonPropertiesController {
	
	
	public static final String PATH_TO_START_FXML = "/application/Start.fxml";
	public static final String PATH_TO_LOGIN_FXML = "/application/Login.fxml";
	public static final String PATH_TO_MY_ACCOUNT_FXML = "/application/MyAccount.fxml";
	public static final String PATH_TO_SEARCH_RESULT_FXML = "/application/SearchResult.fxml";
	public static final String PATH_TO_PARTNER_FXML = "/application/Partner.fxml";
	public static final String PATH_TO_SALONS_FXML = "/application/Salons.fxml";
	public static final String PATH_TO_REGISTER_FXML = "/application/Register.fxml";

	static ObservableList<Node> getChildren() {
		return null;
	}
	
	// method to go to Scene
	
	public void goToScene(String scene){
	try { // Hier wird die zweite Fenster geöffneta
		FXMLLoader loadScene = new FXMLLoader();
		loadScene.setLocation(getClass().getResource(scene));

		Parent root = (Parent) loadScene.load();

		Scene Scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(Scene);

		stage.show();
		stage.setOnHidden(null);

	} catch (Exception e) {
		System.err.println("Can not load");
		e.printStackTrace();
	}
	}
//	static ObservableList<Result> searchResults = FXCollection.observableArea
	
	
	
	// Account entity repository
		static UserRepository userRepository = new UserRepositoryJPA();  
		static ObservableList<User> userList = FXCollections.observableArrayList(UserRepository.readAll()); //reads all Users List
		static ObjectProperty<User> selectedUser = new SimpleObjectProperty<User>(); //selects current User

		
}
