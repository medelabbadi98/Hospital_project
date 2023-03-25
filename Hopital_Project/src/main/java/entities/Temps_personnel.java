package entities;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Temps_personnel")
public class Temps_personnel {
	@Id
	@GeneratedValue
	private long id_temps_personnel;
	private LocalDate date_temps;
	private LocalTime heure_depart;
	private LocalTime heure_fin;
	public LocalDate getDate_temps() {
		return date_temps;
	}
	public void setDate_temps(LocalDate date_temps) {
		this.date_temps = date_temps;
	}
	public LocalTime getHeure_depart() {
		return heure_depart;
	}
	public void setHeure_depart(LocalTime heure_depart) {
		this.heure_depart = heure_depart;
	}
	public LocalTime getHeure_fin() {
		return heure_fin;
	}
	public void setHeure_fin(LocalTime heure_fin) {
		this.heure_fin = heure_fin;
	}
	public long getId_temps_personnel() {
		return id_temps_personnel;
	}
	

}
