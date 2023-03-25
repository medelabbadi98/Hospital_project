package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Vaccins")
public class Vaccins {
	
	@Id
	@GeneratedValue
	private long id_vaccin;
	private String libelle_vaccin;
	public String getLibelle_vaccin() {
		return libelle_vaccin;
	}
	public void setLibelle_vaccin(String libelle_vaccin) {
		this.libelle_vaccin = libelle_vaccin;
	}
	public long getId_vaccin() {
		return id_vaccin;
	}
	

}
