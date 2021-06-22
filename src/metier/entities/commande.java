package metier.entities;

import java.io.Serializable;
import java.sql.Date;

public class commande implements Serializable {
private int idc;
private int idcl;
private double totprix;
private String datecommande;
private String etat;
private String modeliv;

	public commande(int idcl, double totprix, String datecommande, String etat, String modeliv) {
	super();
	this.idcl = idcl;
	this.totprix = totprix;
	this.datecommande = datecommande;
	this.etat = etat;
	this.modeliv = modeliv;
}
	@Override
public String toString() {
	return "commande [idc=" + idc + ", idcl=" + idcl + ", totprix=" + totprix + ", datecommande=" + datecommande
			+ ", etat=" + etat + ", modeliv=" + modeliv + "]";
}
	public int getIdc() {
	return idc;
}
public void setIdc(int idc) {
	this.idc = idc;
}
public int getIdcl() {
	return idcl;
}
public void setIdcl(int idcl) {
	this.idcl = idcl;
}
public double getTotprix() {
	return totprix;
}
public void setTotprix(double totprix) {
	this.totprix = totprix;
}
public String getDatecommande() {
	return datecommande;
}
public void setDatecommande(String datecommande) {
	this.datecommande = datecommande;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}
public String getModeliv() {
	return modeliv;
}
public void setModeliv(String modeliv) {
	this.modeliv = modeliv;
}
	public commande() {
		// TODO Auto-generated constructor stub
	}

}
