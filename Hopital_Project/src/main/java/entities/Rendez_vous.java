package entities;
import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.loader.ast.spi.Loadable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name = "Rendez_vous")
public class Rendez_vous {

	@Id
	@GeneratedValue
	private long id_rendez_vous;
	private LocalDate date_rendez_vous;
	private LocalTime heure_rendez_vous;
	private boolean confirmed;
	
	@ManyToOne()
	private Medecins medecins;
}
