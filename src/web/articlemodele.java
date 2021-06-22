package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.article;

public class articlemodele {
private String motcle;
private List<article> articles=new ArrayList<article>();

public String getMotcle() {
	return motcle;
}
public void setMotcle(String motcle) {
	this.motcle = motcle;
}
public List<article> getArticles() {
	return articles;
}
public void setArticles(List<article> articles) {
	this.articles = articles;
}



}
