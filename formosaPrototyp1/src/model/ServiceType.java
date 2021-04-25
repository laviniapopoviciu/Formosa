package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public enum ServiceType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)


	MANIKÜRE, PEDIKÜRE,HAARSCHNITT, KOSMETIKBEHANDLUNG, MASSAGE, HAARENTFERNUNG, 

}

