package exercisse_2;

public abstract class Evenement {
	
	protected Personnage hero;
	
	Evenement(Personnage hero) {
		this.hero = hero;
	}

	public Personnage getHero() {
		return hero;
	}

	public void setHero(Personnage hero) {
		this.hero = hero;
	}
	
	public abstract void resoudre(Personnage hero); 

}
 