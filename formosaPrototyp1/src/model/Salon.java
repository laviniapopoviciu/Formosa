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
public class Salon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToMany
	private Salon salon;
	
	@ManyToMany
	private Appointment appointment;
	private String businessName;
	private String businessDescription;
	private String address;
	
	
	
	public Salon(Salon salon, Appointment appointment, String businessName, String businessDescription,
			String address) {
		super();
		this.salon = salon;
		this.appointment = appointment;
		this.businessName = businessName;
		this.businessDescription = businessDescription;
		this.address = address;
	}
	
	//for the Database
	public Salon(long id, Salon salon, Appointment appointment, String businessName, String businessDescription,
			String address) {
		super();
		this.id = id;
		this.salon = salon;
		this.appointment = appointment;
		this.businessName = businessName;
		this.businessDescription = businessDescription;
		this.address = address;
	}
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
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	




}
