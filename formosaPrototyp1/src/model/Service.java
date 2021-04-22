package model;


import java.io.Serializable;
import java.math.BigInteger;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Service implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	 


	public User() {

	}

	public User(long id, String username,String password, String firstName, String lastName) {

		super();
		this.id=id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		 
		
	}

	// For the Database
	public User(Long id, String username, String password, String firstName, String lastName) {
		super();
		this.id = id;
		this.username=username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	 

}
