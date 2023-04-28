package exercisse_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Donjon {
	
	private ArrayList<Personnage> ennemis = new ArrayList<Personnage>();
	
	public ArrayList<Personnage> getEnnemis() {
		return ennemis;
	}

	public void setEnnemis(ArrayList<Personnage> ennemis) {
		this.ennemis = ennemis;
	}

	
	
	public void explorerDonjon(Personnage hero) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Longueur souhaiteé du donjon : ");
		int longueur = input.nextInt();
		input.close();
		
		for(int i = 0; i < longueur; i++) {
			Arme armeRandom = new Arme("Arme "+(i+1), (int)(Math.random() * 30));
			Armure armureRandom = new Armure("Armure "+(i+1), (int)(Math.random() * 30));
			Personnage randomMonster = new Personnage(((Math.random() * 50) + 50), "Random Monster "+(i+1), armeRandom, armureRandom);
			ennemis.add(randomMonster);
		}
		
		boolean test = true;
		
		for(int i = 0; i < ennemis.size() && test; i++) {
			Combat nouveauCombat = new Combat(hero, ennemis.get(i));
			nouveauCombat.resoudreCombat();
			
			if(hero.getHp() == 0) {
				test = false;
			}
		}
	}
	
	

}
