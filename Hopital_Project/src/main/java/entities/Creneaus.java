package entities;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Creneaus")
public class Creneaus {
	@Id
	@GeneratedValue
	long id;
	
	private Date date_cre;
	private LocalTime heure_d_cre;
	private LocalTime heure_c_cre;
	
	@OneToMany(mappedBy = "medecins" )
	private Medecins medecins;
	

	
}
