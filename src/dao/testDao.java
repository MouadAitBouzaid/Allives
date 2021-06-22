package dao;

import java.util.List;

import metier.entities.article;
import metier.entities.user;

public class testDao {

	public static void main(String[] args) {
		articledaoimpl dao= new articledaoimpl();
	
		
		article p2= new article();
		p2=dao.getarticle(41);
		p2.toString();
/*	user u = new user();
	u=dao.login("test", "test");
	u.toString();	
/*	user u=dao.register(new user("hamid","bo9al","22/01/1996","gsdgds","gsdgds","user","adresse"));
	System.out.println(u.toString()); 
	*/	
		
	}
}
