import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@ Entity
@ Table (name = "Users")
public class Users  {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column	
	private String id;
	@Column	
	private String prenom;
	@Column	
	private String nom;
	@Column	
	private String mail;
	@Column	
	private String password;
	@Column	
	private Voiture voiture;
	


	public Users(){

	}



	public Users(String id, String prenom, String nom, String mail, String password, Voiture voiture) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.mail = mail;
		this.password = password;
		this.voiture = voiture;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Voiture getVoiture() {
		return voiture;
	}



	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	



}
