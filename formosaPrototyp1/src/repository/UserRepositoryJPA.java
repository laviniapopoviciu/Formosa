
package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.User;
 

public class UserRepositoryJPA implements UserRepository{
	
	private static final String PERSISTANCE_UNIT_NAME = "formosa_DB";

	public void add(User user) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		em.persist(user);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
	}

	
	@Override
	public User updateAccount(User user) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
	 User updateAccount = em.merge(user);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		return updateAccount;
	}

	@Override
	public Optional<User> read(long id) {
		
		User user = null;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		user =	em.find(User.class, id);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
		return Optional.ofNullable(user);
	}

	
public List<User> readAll() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		System.out.println("Read all Users");
		
		et.begin();
		List<User> users = new ArrayList<>();
		
		TypedQuery<User> query = em.createNamedQuery("readAllUsers", User.class);
		users = query.getResultList();
		
		et.commit();
		
		em.close();
		emf.close();
		
		return users;
	}

	@Override
	public void delete(User user) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		em.remove(user);
		
		transaction.commit();
		
		em.close();
		emf.close();
		
	}

	 

}
