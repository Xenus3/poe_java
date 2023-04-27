package exercisse_1;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	
	List<Article> article = new ArrayList<Article>();
	Utilisateur user;
	
	
	void addArticle(Article article){
		this.article.add(article);
	}

	void removeArticle(int index){
		if(index >= 0 && index < this.article.size())
			this.article.remove(index);
	}
	
	void afficherPanier() {
		System.out.println("Liste des produits dans le panier : ");
		
		for(int i = 0; i < article.size(); i++) {
			
			System.out.println((i+1)+" : "+article.get(i).nom+" "+article.get(i).prix);
		}
	}
		
	void afficherTotale() {
		float total = 0;
		for(int i = 0; i < article.size(); i++) {
			total += this.article.get(i).prix;
		}
		System.out.println("Le totale de votre commande se monte a : "+total);
		
		
	
		
	}
}
