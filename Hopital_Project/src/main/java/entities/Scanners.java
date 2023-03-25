package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Scanners")
public class Scanners {

	@Id
	@GeneratedValue
	private long id_scanner;
	private String label_scanner;
	public String getLabel_scanner() {
		return label_scanner;
	}
	public void setLabel_scanner(String label_scanner) {
		this.label_scanner = label_scanner;
	}
	public long getId_scanner() {
		return id_scanner;
	}
	
	
}
