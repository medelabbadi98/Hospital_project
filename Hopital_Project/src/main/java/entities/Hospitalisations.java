package entities;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Hospitalisations")
public class Hospitalisations {
	
	@Id
	@GeneratedValue
	private long id_hospitalisation;
	private LocalDate date_entrer_hosp;
	private LocalDate date_sortie_hosp;
	public LocalDate getDate_entrer_hosp() {
		return date_entrer_hosp;
	}
	public void setDate_entrer_hosp(LocalDate date_entrer_hosp) {
		this.date_entrer_hosp = date_entrer_hosp;
	}
	public LocalDate getDate_sortie_hosp() {
		return date_sortie_hosp;
	}
	public void setDate_sortie_hosp(LocalDate date_sortie_hosp) {
		this.date_sortie_hosp = date_sortie_hosp;
	}
	public long getId_hospitalisation() {
		return id_hospitalisation;
	}
	

}
