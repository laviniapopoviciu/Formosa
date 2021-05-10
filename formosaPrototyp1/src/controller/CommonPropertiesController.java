package controller;

import application.Constants;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Appointment;
import model.Salon;
import model.Service;
import model.User;

import repository.AppointmentRepository;
import repository.AppointmentRepositoryJPA;
import repository.SalonRepository;
import repository.SalonRepositoryJPA;
import repository.ServiceRepository;
import repository.ServiceRepositoryJPA;
import repository.UserRepository;
import repository.UserRepositoryJPA;

public class CommonPropertiesController extends Constants{
	
	
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
//		static ObservableList<User> userList = FXCollections.observableArrayList(UserRepository.readAll()); //reads all Users List
		static ObjectProperty<User> selectedUser = new SimpleObjectProperty<User>(); //selects current User

		static AppointmentRepository appointmentRepository = new AppointmentRepositoryJPA();
//		static ObservableList<Appointment> appointments = FXCollections.observableArrayList(appointmentRepository.readAll());
		
		static SalonRepository salonRepository = new SalonRepositoryJPA();
//		static ObservableList<Salon> salons = FXCollections.observableArrayList(salonRepository.readAll());
		
		static ServiceRepository serviceRepository = new ServiceRepositoryJPA();
//		static ObservableList<Service> services = FXCollections.observableArrayList(serviceRepository.readAll());	
}
