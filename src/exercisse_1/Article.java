package exercisse_1;

public class Article {
	
	int nProduit;
	String nom;
	float prix;
	
	Article (int nProduit, String nom, float prix) {
		this.nProduit = nProduit;
		this.nom = nom;
		this.prix = prix;
	}
	
	
	
	String addFavorite() {
		return "This article is in your favourite list !";
	}
}
