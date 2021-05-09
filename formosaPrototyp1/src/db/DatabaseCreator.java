package db;


import java.util.Date;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Appointment;
import model.CustomerType;
import model.Salon;
import model.Service;
import model.ServiceType;
import model.User;


public class DatabaseCreator {
	public static void main(String[] args) {

		insertDummyData();
	}
		private static void createNewDatabase() {

		}

		private static void dropOldTable() {

		}

private static void insertDummyData() {

	
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formosa_DB");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		List<Service> services = List.of(new Service(ServiceType.HAARSCHNITT, 99.0));
		
	//	Service(long id, ServiceType type, double price)
		
//Salon(long id, List<Service> services , List<Appointment> appointments, String businessName, String businessDescription, List<CustomerType> customerTypes, String address)
//		Salon salon = new Salon(services, null,  "LaruBeauty", "Dein Beautywelt für alle Beautyleistungen",
//				"Kärntenstraße 10, 1010 Wien");

//	List<Salon> salonList = List.of(new Salon(0l, ServiceType , List<Appointment> appointments, "LaruBeauty", "Dein Beautywelt für alle Beautyleistungen",
//			"Kärntenstraße 10, 1010 Wien"));
//	List<Appointment> appointmentList = List.of( new Appointment(0l, "LaruBeauty", ServiceType.HAARSCHNITT, user, "20.05.2021 10:30", "20.05.2021 11:30"));
	
	User user = new User(1l,"Lavi", "test", "Lavinia", "Popoviciu", "lavinia.popovciu@hotmail.com");
		
		et.begin();
		
		em.persist(user);
		
		et.commit();
		
		em.close();
		emf.close();
		
	}


}
