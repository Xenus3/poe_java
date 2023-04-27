package exercisse_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
	List<Article> produits = new ArrayList<Article>();
	LocalDate dateCommande;
	LocalDate dateLivraison;
	
	Commande(List<Article> produits, LocalDate dateCommande) {
		this.produits = produits;
		this.dateCommande = dateCommande;
	}

}
