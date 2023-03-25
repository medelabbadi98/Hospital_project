package entities;

import java.time.DateTimeException;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Creneaus")
public class Creneaus {
	
	private Date date_cre;
	private Date heure_d_cre;
	private Date heure_c_cre;
	

}
