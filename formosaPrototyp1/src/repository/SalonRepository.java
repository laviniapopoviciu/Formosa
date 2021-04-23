package repository;

import java.util.List;
import java.util.Optional;

import model.Salon;

public interface SalonRepository {

	void add(Salon salon);

	Optional<Salon> read(long id);

	List<Salon> readAll();

	Salon updateSalonInfo(Salon salon);

	void delete(Salon salon);


}
