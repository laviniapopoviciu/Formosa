package model;


import java.io.Serializable;
import java.util.Date;

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
	
	private Date beginDate;
	private Date endDate;
	
	
	
	
	public Appointment(Salon salon, Service service, User user, Date beginDate, Date endDate) {
		super();
		this.salon = salon;
		this.service = service;
		this.user = user;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}

	//for the Database
	public Appointment(long id, Salon salon, Service service, User user, Date beginDate, Date endDate) {
		super();
		this.id = id;
		this.salon = salon;
		this.service = service;
		this.user = user;
		this.beginDate = beginDate;
		this.endDate = endDate;
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

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}