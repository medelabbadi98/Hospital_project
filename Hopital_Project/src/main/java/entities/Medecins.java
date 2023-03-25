package entities;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Medecins")
public class Medecins {

	@Id
	@GeneratedValue
	private long code_medecin;
	private String nom_medecin;
	private String prenom_medecin;
	private String tel_medecin;
	private String email_medecin;
	private LocalDate date_naissance;
	public String getNom_medecin() {
		return nom_medecin;
	}
	public void setNom_medecin(String nom_medecin) {
		this.nom_medecin = nom_medecin;
	}
	public String getPrenom_medecin() {
		return prenom_medecin;
	}
	public void setPrenom_medecin(String prenom_medecin) {
		this.prenom_medecin = prenom_medecin;
	}
	public String getTel_medecin() {
		return tel_medecin;
	}
	public void setTel_medecin(String tel_medecin) {
		this.tel_medecin = tel_medecin;
	}
	public String getEmail_medecin() {
		return email_medecin;
	}
	public void setEmail_medecin(String email_medecin) {
		this.email_medecin = email_medecin;
	}
	public LocalDate getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(LocalDate date_naissance) {
		this.date_naissance = date_naissance;
	}
	public long getCode_medecin() {
		return code_medecin;
	}
	

}
