package model;


import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity
public class Service implements Serializable {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@OneToMany
	ServiceType type;
	 
	private double price;
	
	 
	public Service(ServiceType type, double price) {
		super();
		this.type = type;
		this.price = price;
	}
	
	 //for the Database
	public Service(long id, ServiceType type, double price) {
		super();
		this.id = id;
		this.type = type;
		this.price = price;
	}

	public ServiceType getType() {
		return type;
	}

	public void setType(ServiceType type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



}
