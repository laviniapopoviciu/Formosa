package model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Salon implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToMany
	private List<Service> services;
	
	@ManyToMany
	private List<Appointment> appointments;


	private String businessName;
	private String businessDescription;
	
	private List<CustomerType> customerTypes;
	private String address;
	
	public Salon() {}
	
	public Salon(List<Service> services , List<Appointment> appointments, String businessName, String businessDescription, List<CustomerType> customerTypes,
			String address) {
		super();
		this.services = services;
		this.appointments = appointments;
		this.businessName = businessName;
		this.businessDescription = businessDescription;
		this.customerTypes=customerTypes;
		this.address = address;
	}
	
	//for the Database
	public Salon(long id, List<Service> services , List<Appointment> appointments, String businessName, String businessDescription, List<CustomerType> customerTypes,
			String address) {
		super();
		this.id = id;
		this.services = services;
		this.appointments = appointments;
		this.businessName = businessName;
		this.businessDescription = businessDescription;
		this.customerTypes=customerTypes;
		this.address = address;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
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

	public List<CustomerType> getCustomerTypes() {
		return getCustomerTypes();
	}

	public void setCustomerTypes(List<CustomerType> customerTypes) {
		this.customerTypes = customerTypes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	



}
