package metier.entities;

import java.io.Serializable;

public class article implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private long id;
 private String libelle;
 private double prixunit;
 private String type;
 private String image;
 
 public article() {
		// TODO Auto-generated constructor stub
	}
public article(String libelle, double prixunit, String type, String image) {
	super();
	this.libelle = libelle;
	this.prixunit = prixunit;
	this.type = type;
	this.image=image;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getLibelle() {
	  
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public double getPrixunit() {
	return prixunit;
}

@Override
public String toString() {
	return "article [id=" + id + ", libelle=" + libelle + ", prixunit=" + prixunit + ", type=" + type + "]";
}

public void setPrixunit(double prixunit) {
	this.prixunit = prixunit;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}



}
