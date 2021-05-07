package repository;

import java.util.List;
import java.util.Optional;

import model.User;

public interface UserRepository {

	static void add(User user) {
		// TODO Auto-generated method stub
		
	}

	Optional<User> read(long id);

	static List<User> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	User updateAccount(User user);

	void delete(User user);


}
