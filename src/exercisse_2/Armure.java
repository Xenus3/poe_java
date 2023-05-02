package exercisse_2;

public class Armure extends Objet {
	
	
	private int defense;
	
	Armure(String nom, int poids, int defense) {
		super(nom, poids);
		this.defense = defense;
	}

	

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}



	@Override
	public void utiliser(Personnage cible) {
		// TODO Auto-generated method stub
		cible.setArmure(this);
	}
	
	
	
}
