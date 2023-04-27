package exercisse_2;

public class Armure {
	
	private String nom;
	private int defense;
	
	Armure(String nom, int defense) {
		this.nom = nom;
		this.defense = defense;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	
}
