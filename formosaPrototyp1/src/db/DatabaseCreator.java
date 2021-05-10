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
		
		List<CustomerType> customerTypes = List.of(CustomerType.DAMEN,CustomerType.KINDER);

		
		List<Service> services = List.of(new Service(0l,ServiceType.HAARSCHNITT, 99.0),
				new Service(0l,ServiceType.HAARENTFERNUNG,120));
		
		List<Salon> salons = List.of(new Salon(0l, services, null, "LaruBeauty", "Dein Beauty Welt geöffnet jeden Tag Montag bis Samstag  10-19 Uhr", customerTypes,"Landstrasse 50 1030 Wien"));
		
		List<Appointment> appointments =List.of(new Appointment(0l, services, new User(1l,"Lavi", "test", "Lavinia", "Popoviciu", "lavinia.popovciu@hotmail.com",null), CustomerType.DAMEN));
		
	 		
		User user = new User(1l,"Laura", "test", "Laura", "Dan", "danlaura360@yahoo.com",appointments);
		
		
		et.begin();
		
		em.persist(user);
		
		et.commit();
		
		em.close();
		emf.close();
		
	}


}
