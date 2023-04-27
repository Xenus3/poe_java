package exercisse_1;

public class Utilisateur {
	
	String nom;
	String prenom;
	int nUtilisateur;
	Panier panier;
	Commande[] commandes;
	
	
	
	Utilisateur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.panier = new Panier();
	}
	
	String consulterCommande() {
		return "L'historique des commandes";
	}
}
