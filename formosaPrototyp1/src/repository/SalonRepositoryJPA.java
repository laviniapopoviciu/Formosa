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
 

 public class SalonRepositoryJPA   implements SalonRepository{
	
	private static final String PERSISTANCE_UNIT_NAME = "formosa_DB";






	@Override
	public void add(Salon salon) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		em.persist(salon);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		
	}




	@Override
	public Salon updateSalonInfo(Salon salon) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void delete(Salon salon) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public Optional<Salon> read(long id) {
		Salon salon = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		salon =	em.find(Salon.class, id);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		return Optional.ofNullable(salon);
	}




	@Override
	public List<Salon> readAll() {
List<Salon> salons = new ArrayList<>();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		//TypedQuery<Salonr> query = em.createQuery("select ph from Photo ph", Photo.class);
	//	salons = query.getResultList();
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		
		return salons;
	}

	

	 

}
