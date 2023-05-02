package exercisse_2;


import java.util.ArrayList;
import java.util.Random;

public class Donjon {
	
	private ArrayList<Evenement> salles = new ArrayList<Evenement>();
	private Personnage hero;
	
	public Donjon(int nbPieces, Personnage hero) {
		
		this.hero = hero;
		Random rand = new Random();
		
		for(int i = 0; i < nbPieces; i++) {
			if(rand.nextBoolean()) {
				salles.add(new Combat(this.hero, Data.randomMonster()));
			} else {
				salles.add(new Piege(this.hero, rand.nextInt(30)));
			}
		}
	}

		
	public void explorerDonjon() {
	
		boolean test = true;
		
		
		
		for(int i = 0; i < salles.size() && test; i++) {
			
			salles.get(i).resoudre();
			
			if(hero.getHp() == 0) {
				test = false;
			}
		}
	}
	
	

}
