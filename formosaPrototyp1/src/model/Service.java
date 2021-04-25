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
	public Service(Salon salon, Appointment appointment, double price) {
		super();
		this.salon = salon;
		this.appointment = appointment;
		this.price = price;
	}
	
	 //for the Database
	public Service(long id, Salon salon, Appointment appointment, double price) {
		super();
		this.id = id;
		this.salon = salon;
		this.appointment = appointment;
		this.price = price;
	}



}
