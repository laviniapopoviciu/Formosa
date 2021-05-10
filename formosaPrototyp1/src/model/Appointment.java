package model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


@Entity
public class Appointment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@ManyToMany
	private Salon salon;
	
	@OneToMany
	private Service service;
	
	@ManyToOne
	private User user;
	private CustomerType customerType;
//	private Date beginDate;
//	private Date endDate;
	
	
	
	
	public Appointment(long l, List<Service> services, User user, CustomerType customerType) {
		super();
	
		this.service = (Service) services;
		this.user = user;
		this.customerType=customerType;
	//	this.beginDate = beginDate;
	//	this.endDate = endDate;
	}

	//for the Database
	public Appointment(long id, Salon salon, Service service, User user, CustomerType customerType) {
		super();
		this.id = id;
		this.salon = salon;
		this.service = service;
		this.user = user;
		this.customerType=customerType;
	//	this.beginDate = beginDate;
	//	this.endDate = endDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public Salon getSalon() {
		return salon;
	}

	public void setSalon(Salon salon) {
		this.salon = salon;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

//	public Date getBeginDate() {
//		return beginDate;
//	}
//
//	public void setBeginDate(Date beginDate) {
//		this.beginDate = beginDate;
//	}
//
//	public Date getEndDate() {
//		return endDate;
//	}
//
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}

}