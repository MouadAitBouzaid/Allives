package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.article;
import metier.entities.commande;
import metier.entities.user;

public class articledaoimpl implements IArticleDao {

	public articledaoimpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public article save(article a) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO article (libelle,type,prixUnit,image) VALUES (?,?,?,?)");
			ps.setString(1,a.getLibelle());
			ps.setString(2,a.getType());
			ps.setDouble(3,a.getPrixunit());
			ps.setString(4,a.getImage());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(idArticle) AS maxid FROM article");
			ResultSet rs=ps2.executeQuery();
			if (rs.next()) {
				a.setId(rs.getLong("maxid"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}

	@Override
	public List<article> articleparmc(String mc) {
		List<article> articles=new ArrayList<article>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("select * from article where libelle like ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				article a=new article();
				a.setId(rs.getLong("idArticle"));
				a.setLibelle(rs.getString("libelle"));
				a.setType(rs.getString("type"));
				a.setPrixunit(rs.getDouble("prixUnit"));
				a.setImage(rs.getString("image"));
				articles.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public article getarticle(int id) {
		article a=null;
		Connection connection=SingletonConnection.getConnection();
		
		
		try {
			PreparedStatement ps=connection.prepareStatement("select * from article where idArticle=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		a = new article();
		a.setId(id);
		a.setLibelle(rs.getString("libelle"));
		a.setType(rs.getString("type"));
		a.setPrixunit(rs.getDouble("prixUnit"));
		a.setImage(rs.getString("image"));
		}
	
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public article update(article a) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("Update article set libelle=?, type=?, prixUnit=?, imaget=? where idArticle=?");
		ps.setString(1,a.getLibelle());
		ps.setString(2,a.getType());
		ps.setDouble(3,a.getPrixunit());
		ps.setString(4,a.getImage());
		ps.setLong(5,a.getId());
		ps.executeUpdate();
		ps.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}

	@Override
	public void delete(int id) {
		Connection connection=SingletonConnection.getConnection();
		try {PreparedStatement ps=connection.prepareStatement("Delete from article where idArticle=?");
		ps.setInt(1, id);
		ps.executeUpdate();
	}
		catch(Exception e) {
		e.printStackTrace();
		}
	}

	@Override
	public user login(String login, String pass) {
		Connection connection=SingletonConnection.getConnection();
		user u=new user();
		try {
			PreparedStatement ps=connection.prepareStatement("select * from utilisateur where login=? and motDePasse=? ");
			ps.setString(1,login);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			if (rs.next() )  {
				u.setId(rs.getInt("idUser"));
				u.setNom(rs.getString("nomUser"));
				u.setPrenom(rs.getString("prenomUser"));
				u.setDatenaissance(rs.getString("dateNaissance"));
				u.setLogin(rs.getString("login"));
				u.setMotdepasse(rs.getString("motDePasse"));
				u.setRole(rs.getString("role"));
				u.setAdresse(rs.getString("adresse"));

				return u ;
			}
			else {
				return null;
			}
			
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u ;
	}

	@Override
	public user register(user u) {
		
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO utilisateur (nomUser,prenomUser,dateNaissance,login,motDePasse,role,adresse) VALUES (?,?,?,?,?,?,?)");
			ps.setString(1,u.getNom());
			ps.setString(2,u.getPrenom());
			ps.setString(3,u.getDatenaissance());
			ps.setString(4,u.getLogin());
			ps.setString(5,u.getMotdepasse());
			ps.setString(6,u.getRole());
			ps.setString(7,u.getAdresse());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(idUser) AS maxid FROM utilisateur");
			ResultSet rs=ps2.executeQuery();
			if (rs.next()) {
				u.setId(rs.getInt("maxid"));
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		return u;
	}

	@Override
	public List<article> catalogue() {
		List<article> articles=new ArrayList<article>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("select * from article ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				article a=new article();
				a.setId(rs.getLong("idArticle"));
				a.setLibelle(rs.getString("libelle"));
				a.setType(rs.getString("type"));
				a.setPrixunit(rs.getDouble("prixUnit"));
				a.setImage(rs.getString("image"));
				articles.add(a);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return articles;
		
	}
	
	@Override
	public commande nouvelle_commande(commande c) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO commande (idUser,totalPrix,dateCommande,etat,modeLivraison) VALUES (?,?,?,?)");
			ps.setInt(1,c.getIdcl());
			ps.setDouble(2,c.getTotprix());
			ps.setString(3,c.getDatecommande());
			ps.setString(4, c.getEtat());
			ps.setString(5,c.getModeliv());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(idCommande) AS maxid FROM commande");
			ResultSet rs=ps2.executeQuery();
			if (rs.next()) {
				c.setIdc(rs.getInt("maxid"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
		
		
	
	}

	@Override
	public void modifier_etat(int idc,String etat) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
					("Update commande set etat=?  where idCommande=?");
		ps.setString(1,etat);
		ps.setInt(2, idc);
		
		ps.executeUpdate();
		ps.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void delete_commande(int idc) {
		
		Connection connection=SingletonConnection.getConnection();
		try {PreparedStatement ps=connection.prepareStatement("Delete from commande where idCommande=?");
		ps.setInt(1, idc);
		ps.executeUpdate();
	}
		catch(Exception e) {
		e.printStackTrace();
		}
		
	}

	@Override
	public List<commande> commandeuser(int iduser) {
	
		List<commande> commandes=new ArrayList<commande>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("select * from commande where idUser=? ");
			ps.setInt(1, iduser);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				commande c=new commande();
				c.setIdc(rs.getInt("idCommande"));
				c.setIdcl(rs.getInt("idUser"));
				c.setTotprix(rs.getDouble("totalPrix"));
				c.setDatecommande(rs.getString("dateCommande"));
				c.setEtat(rs.getString("etat"));
				c.setModeliv(rs.getString("modeLivraison"));
			commandes.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return commandes;
		
	}

	@Override
	public commande getcommande(int id) {
		
Connection connection=SingletonConnection.getConnection();
		
		commande c=null;
		
		try {PreparedStatement ps=connection.prepareStatement("select * from commande where idArticle=id");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if (rs.next()) {
			c=new commande();
		c.setIdc(rs.getInt("idCommande"));
		c.setIdcl(rs.getInt("idUser"));
		c.setDatecommande(rs.getString("dateCommande"));
		c.setTotprix(rs.getDouble("totalPrix"));
		c.setEtat(rs.getString("etat"));
		c.setModeliv(rs.getString("modeLivraison"));
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return c;
	}
	
}
