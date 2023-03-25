package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "User_App")
public class User_App {

	@Id
	@GeneratedValue
	private long id_user;

	private String log;
	private String password;
	private String type_user;
	private String recuperer_id;
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType_user() {
		return type_user;
	}
	public void setType_user(String type_user) {
		this.type_user = type_user;
	}
	public String getRecuperer_id() {
		return recuperer_id;
	}
	public void setRecuperer_id(String recuperer_id) {
		this.recuperer_id = recuperer_id;
	}
	public long getId_user() {
		return id_user;
	}
	
}
