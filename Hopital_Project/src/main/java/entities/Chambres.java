package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Chambres")
public class Chambres {

	@Id
	@GeneratedValue
	private long Id;
	private String type_Ch;
	private long Prix_Ch;
	private String si_prise;
	public Chambres(String type_Ch, long prix_Ch, String si_prise) {
		super();
		this.type_Ch = type_Ch;
		Prix_Ch = prix_Ch;
		this.si_prise = si_prise;
	}
	public String getType_Ch() {
		return type_Ch;
	}
	public void setType_Ch(String type_Ch) {
		this.type_Ch = type_Ch;
	}
	public long getPrix_Ch() {
		return Prix_Ch;
	}
	public void setPrix_Ch(long prix_Ch) {
		Prix_Ch = prix_Ch;
	}
	public String getSi_prise() {
		return si_prise;
	}
	public void setSi_prise(String si_prise) {
		this.si_prise = si_prise;
	}
	
	
}
