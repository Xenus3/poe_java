package exercisse_2;

public class Arme {
	
	private String nom;
	private int attaque;
	
	Arme(String nom, int attaque) {
		this.nom = nom;
		this.attaque = attaque;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}
	
	

}
