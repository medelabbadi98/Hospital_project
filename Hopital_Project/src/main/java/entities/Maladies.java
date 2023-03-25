package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Maladies")
public class Maladies {

	@Id
	@GeneratedValue
	private long id_maladie;
	private String libele_maladie;
	public String getLibele_maladie() {
		return libele_maladie;
	}
	public void setLibele_maladie(String libele_maladie) {
		this.libele_maladie = libele_maladie;
	}
	public long getId_maladie() {
		return id_maladie;
	}
	
	
	
}
