package exercisse_2;

public class Potion extends Objet {
	
	private int pv;
	
	Potion(String nom, int poids, int pv) {
		super(nom, poids);
		this.pv = pv;
	}

	

	public int getPv() {
		return pv;
	}



	public void setPv(int pv) {
		this.pv = pv;
	}



	@Override
	public void utiliser(Personnage cible) {
		
		cible.setHp(cible.getHp() + this.getPv());
		
	}
	
	
}
