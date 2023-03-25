package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Type_Vaccins")
public class Type_Vaccins {
	
	@Id
	@GeneratedValue
	private long id_type_vaccin;
	private String libelle_type;
	public String getLibelle_type() {
		return libelle_type;
	}
	public void setLibelle_type(String libelle_type) {
		this.libelle_type = libelle_type;
	}
	public long getId_type_vaccin() {
		return id_type_vaccin;
	}
	
	 

}
