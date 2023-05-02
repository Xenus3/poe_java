package exercisse_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Donjon {
	
	private ArrayList<Evenement> salles = new ArrayList<Evenement>();
	
	public ArrayList<Evenement> getSalles() {
		return salles;
	}

	public void setSalles(ArrayList<Evenement> salles) {
		this.salles = salles;
	}

	public void genererDonjon() {
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Longueur du donjon : ");
		int longueur = input.nextInt();
		input.close();*/
		
		for(int i = 0; i < 10; i++) {
			
			Random rand = new Random();
			
			if(rand.nextInt(10) < 5) {
				Arme armeRandom = Data.randomArmes[rand.nextInt(Data.randomArmes.length)];
				Armure armureRandom = Data.randomArmures[rand.nextInt(Data.randomArmures.length)];
				Personnage randomMonster = new Personnage(((Math.random() * 50) + 50), Data.genererNom(), armeRandom, armureRandom);
				
			salles.add( new Combat(null, randomMonster));
		
			} else {
				salles.add(new Piege(null, rand.nextInt(30)));
			}
		}
	}
		
	public void explorerDonjon(Personnage hero) {
	
		boolean test = true;
		
		
		
		for(int i = 0; i < salles.size() && test; i++) {
			
			salles.get(i).resoudre(hero);
			
			if(hero.getHp() == 0) {
				test = false;
			}
		}
	}
	
	

}
