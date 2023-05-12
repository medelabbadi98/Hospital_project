package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "Specialites")
public class Specialites {

	private long id_specialite;
	private String libelle_specialite;
	
	@OneToMany(mappedBy = "Medecins")
	private Medecins medecins;
}
