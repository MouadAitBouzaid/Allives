package metier.entities;

import java.io.Serializable;


public class user implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id=-1;
	private String nom;
	private String prenom;
	private String datenaissance;
	private String login;
	private String motdepasse;
	private String role;
	private String adresse;

	
	
	public user( String nom, String prenom, String naissance, String login, String motdepasse, String role,
			String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = naissance;
		this.login = login;
		this.motdepasse = motdepasse;
		this.role = role;
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", datenaissance=" + datenaissance
				+ ", login=" + login + ", motdepasse=" + motdepasse + ", role=" + role + ", adresse=" + adresse + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotdepasse() {
		return motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public user() {
		// TODO Auto-generated constructor stub
	}

	

	
}
