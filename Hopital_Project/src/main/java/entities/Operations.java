package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Operations")
public class Operations {

	@Id
	@GeneratedValue
	private long id_operation;
	private String libelle_operation;
	public String getLibelle_operation() {
		return libelle_operation;
	}
	public void setLibelle_operation(String libelle_operation) {
		this.libelle_operation = libelle_operation;
	}
	public long getId_operation() {
		return id_operation;
	}
	
}
