package entities;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Patients")
public class Patients {
	
	@Id
	private String cin_patient;
	private String nom_patient;
	private String prenom_patient;
	private String genre_patient;
	private String adresse_patient;
	private String tel_patient;
	private String email_patient;
	private String etat_patient;
	private LocalDate date_naissance;
	public String getCin_patient() {
		return cin_patient;
	}
	public void setCin_patient(String cin_patient) {
		this.cin_patient = cin_patient;
	}
	public String getNom_patient() {
		return nom_patient;
	}
	public void setNom_patient(String nom_patient) {
		this.nom_patient = nom_patient;
	}
	public String getPrenom_patient() {
		return prenom_patient;
	}
	public void setPrenom_patient(String prenom_patient) {
		this.prenom_patient = prenom_patient;
	}
	public String getGenre_patient() {
		return genre_patient;
	}
	public void setGenre_patient(String genre_patient) {
		this.genre_patient = genre_patient;
	}
	public String getAdresse_patient() {
		return adresse_patient;
	}
	public void setAdresse_patient(String adresse_patient) {
		this.adresse_patient = adresse_patient;
	}
	public String getTel_patient() {
		return tel_patient;
	}
	public void setTel_patient(String tel_patient) {
		this.tel_patient = tel_patient;
	}
	public String getEmail_patient() {
		return email_patient;
	}
	public void setEmail_patient(String email_patient) {
		this.email_patient = email_patient;
	}
	public String getEtat_patient() {
		return etat_patient;
	}
	public void setEtat_patient(String etat_patient) {
		this.etat_patient = etat_patient;
	}
	public LocalDate getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}
	
	
	
}
