package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;


@Entity
@NamedQuery(name = "readAllUsers", query = "select us from User us")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	 
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Appointment> appointments;

	public User() {

	}

	public User(String username,String password, String firstName, String lastName, String email) {

		super();
		this.email=email;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		 
		
	}

	// For the Database
	public User(Long id, String username, String password, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.username=username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email=email;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 

}
