package repository;
import java.util.List;
import java.util.Optional;

import model.Service;

public interface ServiceRepository {
	
	

		void add(Service service);

		Optional<Service> read(long id);

		List<Service> readAll();

		 

	}


