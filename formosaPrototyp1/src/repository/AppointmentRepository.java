package repository;

import java.util.List;
import java.util.Optional;

import model.Appointment;

public interface AppointmentRepository{

	void add(Appointment appointment);

	Optional<Appointment> read(long id);

	List<Appointment> readAll();


	void delete(Appointment appointment);


}
