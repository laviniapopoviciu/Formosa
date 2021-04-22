package repository;

import java.util.List;
import java.util.Optional;

import model.User;

public interface UserRepository {

	void add(User user);

	Optional<User> read(long id);

	List<User> readAll();

	User updateAccount(User user);

	void delete(User user);


}
