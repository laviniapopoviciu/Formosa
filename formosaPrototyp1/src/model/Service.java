package model;


import java.io.Serializable;
import java.math.BigInteger;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Service implements Serializable {

	public enum serviceType { MANICURE, PEDICURE,HAIRCUT, FACIAL, MASSAGE

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToMany
	private Salon salon;
	
	@OneToOne
	private Appointment appointment;
	private double price;
	public Salon getSalon() {
		return salon;
	}
	public void setSalon(Salon salon) {
		this.salon = salon;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Service(long id, Salon salon, Appointment appointment, double price) {
		super();
		this.id = id;
		this.salon = salon;
		this.appointment = appointment;
		this.price = price;
	}
	
	 
	 


//	public User() {
//
//	}
//
//	public User(long id, String username,String password, String firstName, String lastName) {
//
//		super();
//		this.id=id;
//		this.username = username;
//		this.password = password;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		 
//		
//	}
//
//	// For the Database
//	public User(Long id, String username, String password, String firstName, String lastName) {
//		super();
//		this.id = id;
//		this.username=username;
//		this.password = password;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}

	 

}
