package exercisse_2;

public class Arme extends Objet {
	
	private int attaque;
	
	Arme(String nom, int poids, int attaque) {
		super(nom, poids);
		this.attaque = attaque;
	}

	

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}



	@Override
	public void utiliser(Personnage cible) {
		// TODO Auto-generated method stub
			cible.setArme(this);
	}
	
	

}
