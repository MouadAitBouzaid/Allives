package dao;

import java.util.List;

import metier.entities.article;
import metier.entities.commande;
import metier.entities.user;

public interface IArticleDao {
	public article save(article a);
	public List<article> articleparmc(String mc);
	public article getarticle(int id);
	public article update(article a);
	public void delete(int id);
	public user login(String login,String Pass);
	public user register(user u);
	public List<article> catalogue();
	public commande nouvelle_commande(commande c);
	public void modifier_etat(int idc,String etat);
	public void delete_commande(int idc);
	public List<commande> commandeuser(int iduser);
	public commande getcommande(int id);

}
