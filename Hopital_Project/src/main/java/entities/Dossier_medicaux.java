package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Dossier_medicaux")
public class Dossier_medicaux {
	
	@Id
	private long num_dossier;
}
