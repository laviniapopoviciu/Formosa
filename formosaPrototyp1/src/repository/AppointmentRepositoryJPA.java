package repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Appointment;

 

 public class AppointmentRepositoryJPA   implements AppointmentRepository{
	
	private static final String PERSISTANCE_UNIT_NAME = "formosa_DB";






	@Override
	public void add(Appointment appointment) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		em.persist(appointment);
		
		transaction.commit();
		
	em.close();
	emf.close();
		System.out.println("Appointment added");
		
		
		
 

	}



	@Override
	public void delete(Appointment appointment) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		em.remove(appointment);
		transaction.commit();
	}




	@Override
	public Optional<Appointment> read(long id) {
		Appointment appointment = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		appointment =	em.find(Appointment.class, id);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		return Optional.ofNullable(appointment);
	}




	@Override
	public List<Appointment> readAll() {
List<Appointment> appointments = new ArrayList<>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		TypedQuery<Appointment> query = em.createNamedQuery("readAllAppointments", Appointment.class);
		appointments = query.getResultList();
	
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		System.err.println("all Appointments: " + appointments);
		return appointments;
	}

	

	 

}
  

	 

	 

	 


	 

	 

