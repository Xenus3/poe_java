package exercisse_2;

import java.util.ArrayList;

public class Personnage {
	
	private double hp;
	private String nom;
	private Arme arme;
	private Armure armure;
	private ArrayList<Objet> inventaire = new ArrayList<Objet>();
	
	Personnage (double hp, String nom, Arme arme, Armure armure) {
		this.hp = hp;
		this.nom = nom;
		this.arme = arme;
		this.armure = armure;
		}
	
	public double getHp() {
		return hp;
	}
	
	public void setHp(double newHp) {
		this.hp = newHp;
	}
	
	public String getName() {
		return nom;
	}
	
	public void setName(String newName) {
		this.nom = newName;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		if(this.arme != null) {
			this.inventaire.add(this.arme);
			}
		
		this.arme = arme;
	}

	public Armure getArmure() {
		return armure;
	}

	public void setArmure(Armure armure) {
		if(this.armure != null) {
			this.inventaire.add(this.armure);
			}
		
		this.armure = armure;
	}
	
	public boolean isAlive() {
		return this.getHp() > 0;
	}
	
	// Methode pour combattre
	
	public void combattre(Personnage personnage1) {
		
		
		personnage1.setHp(personnage1.hp - (this.arme.getAttaque() - (0.1 * personnage1.armure.getDefense())));
		if(personnage1.getHp() < 0) {
			personnage1.setHp(0);
			
		} 
		System.out.println("points de vie de "+personnage1.nom+" : "+personnage1.getHp());
		
		
		
	
	}
	
	// Redefinition de la methode toString
	
	

	public String toString() {
		return this.getName()+" : "+this.getHp()+", "+this.arme.getNom()+" "+this.armure.getNom();
	}

	public ArrayList<Objet> getInventaire() {
		return inventaire;
	}

	public void setInventaire(ArrayList<Objet> inventaire) {
		this.inventaire = inventaire;
	}
	
	
	
	
}	

