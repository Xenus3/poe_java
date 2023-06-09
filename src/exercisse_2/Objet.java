package exercisse_2;

public abstract class Objet {
	
	protected String nom;
	protected int poids;
	
	Objet(String nom, int poids) {
		this.nom = nom;
		this.poids = poids;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public abstract void utiliser(Personnage cible);
	
	

}
