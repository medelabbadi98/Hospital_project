package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Type_Maladies")
public class Type_Maladies {
	
	@Id
	@GeneratedValue
	private long id_type_maladie;
	private String libelle_type;
	public String getLibelle_type() {
		return libelle_type;
	}
	public void setLibelle_type(String libelle_type) {
		this.libelle_type = libelle_type;
	}
	public long getId_type_maladie() {
		return id_type_maladie;
	}
	

}
