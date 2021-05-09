package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Salon;
import model.Service;
 

 public class ServiceRepositoryJPA  implements ServiceRepository{
	
	private static final String PERSISTANCE_UNIT_NAME = "formosa_DB";

	@Override
	public void add(Service service) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		em.persist(service);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
	}

	
	

	@Override
	public Optional<Service> read(long id) {
		
		Service service = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		service =	em.find(Service.class, id);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		return Optional.ofNullable(service);
	}

	@Override
	public List<Service> readAll() {
		
		List<Service> services = new ArrayList<>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		TypedQuery<Service> query = em.createNamedQuery("readAllServices", Service.class);
		services = query.getResultList();
		
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		
		return services;
	}




	@Override
	public Service updateService(Service service) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();

		Service updateService = em.merge(service);
		transaction.commit();
		em.close();
		emf.close();
		System.out.println("Service updated");

		return updateService;
	}




	@Override
	public void delete(Service service) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		em.remove(service);
		transaction.commit();
		em.close();
		emf.close();
		
	}

	

	 

}
