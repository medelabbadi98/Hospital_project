package entities;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "Service_de_garde")
public class Service_de_garde {

	@Id
	@GeneratedValue
	private long id_service;
	private LocalDate date_service;
	
	@ManyToMany(mappedBy = "medecins")
	private Medecins medecins;
	
	public LocalDate getDate_service() {
		return date_service;
	}
	public void setDate_service(LocalDate date_service) {
		this.date_service = date_service;
	}
	public long getId_service() {
		return id_service;
	}
	
}
