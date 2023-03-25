package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Lits")
public class Lits {

	@Id
	@GeneratedValue
	private long num_lit;
	private long prix;
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public long getNum_lit() {
		return num_lit;
	}
	
	
	
}
