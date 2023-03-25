package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Traitements")
public class Traitements {

	@Id
	@GeneratedValue
	private long id_traitement;
	private String type_traitement;
	private long frai_traitement;
	public String getType_traitement() {
		return type_traitement;
	}
	public void setType_traitement(String type_traitement) {
		this.type_traitement = type_traitement;
	}
	public long getFrai_traitement() {
		return frai_traitement;
	}
	public void setFrai_traitement(long frai_traitement) {
		this.frai_traitement = frai_traitement;
	}
	public long getId_traitement() {
		return id_traitement;
	}
	
	
	
}
