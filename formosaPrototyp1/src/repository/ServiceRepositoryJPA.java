package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Service;
 

 public class ServiceRepositoryJPA  implements ServiceRepository{
	
	private static final String PERSISTANCE_UNIT_NAME = "service_jpa";

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
		
		//TypedQuery<User> query = em.createQuery("select ph from Photo ph", Photo.class);
	//	photos = query.getResultList();
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		
		return services;
	}

	

	 

}
