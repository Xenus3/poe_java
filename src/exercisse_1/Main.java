package exercisse_1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Connexion utilisateur : ");
		System.out.println("Entrez votre nom : ");
		String nom = input.next();
		System.out.println("Entrez votre prenom : ");
		String prenom = input.next();
		
		
		Utilisateur u1 = new Utilisateur(nom, prenom);
		List<Article> catalogue = new ArrayList<Article>();
		catalogue.add(new Article(1, "Stylo", 1.99f));
		catalogue.add(new Article(2, "Crayon", 0.99f));
		
		
		for (int i = 0; i < catalogue.size(); i++) {
			System.out.println(catalogue.get(i).nom);
		}

		int choix = 0;
		
		do {
			
			
			System.out.println("Menu : ");
			System.out.println("1 - Ajouter un produit au panier");
			System.out.println("2 - Retirer un produit du panier");
			System.out.println("3 - Afficher panier");
			System.out.println("4 - Consulter un produit");
			System.out.println("5 - Valider commande");
			System.out.println("9 - Quitter");
			
			choix = input.nextInt();
			int choixProduit;
			
			switch(choix) {
			
			case 1:
				
				System.out.println("Numero du produit a ajouter : ");
				int numP = input.nextInt();
				
				u1.panier.addArticle(catalogue.get(numP - 1));
				
				break;
				
			case 2:
				
				u1.panier.afficherPanier();
				System.out.println("Numero du produit a retirer : ");
				int numEr = input.nextInt();
				
				u1.panier.removeArticle(numEr - 1);
				
				
				break;
				
			case 3:
				
				u1.panier.afficherPanier();
				
				
				break;
				
			case 4:
				
				System.out.println("Numero du produit a consulter : ");
				int numCheck = input.nextInt();
				
				for(int i = 0; i < catalogue.size(); i++) {
					if(( i + 1 )== numCheck) {
						System.out.println(catalogue.get(i).nProduit+" : "+catalogue.get(i).nom+" "+catalogue.get(i).prix);
					} 
				}
				
				break;
				
			case 5:
				
				u1.panier.afficherPanier();
				System.out.println("Veuillez confirmer votre panier (oui/non)");
				String confirmation = input.next();
				if (confirmation.equals("oui")) {
				// creer un objet commande
				LocalDate date = LocalDate.now();
				Commande commande1 = new Commande(u1.panier.article, date);
				// date de livraison
				commande1.dateLivraison = date.plusDays(5);
		
				}
				// Afficher le totale
				u1.panier.afficherTotale();
				   
				
				// vider panier
				u1.panier = new Panier();
				//arret programme
				
				System.out.println("Merci pour votre commande !");
				choix = 9;
				
				break;
			}
			
			
		} while (choix != 9);
		
	}

}
