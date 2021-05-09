package application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DatabaseContext {
	private static final String PERSISTENCE_UNIT_NAME = "formosa_DB";
	private static EntityManagerFactory emf;
	private static EntityManager em;
	
	static void setupDatabase() {
		
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}
	
	static void bringDownDatabase() {
		
		em.close();
		emf.close();
	}

	
	@SuppressWarnings("exports")
	public static EntityManager getEntityManager() {
		
		return em;
	}
}
