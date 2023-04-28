package exercisse_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		

		Arme arme1= new Arme("Epee Rouillé", 20);
		Arme arme2 = new Arme("Masse", 30);
		
		Armure armure1 = new Armure("Armure en carton", 10);
		Armure armure2 = new Armure("Armure en carton renforcé", 15);
		
		
		Personnage JP = new Personnage(200, "Jean Paul", arme1, armure1);
		Personnage goblin = new Personnage(40, "Goblin", arme2, armure2);
		Personnage orc = new Personnage(20, "Orc", arme1, armure2);
		Personnage troll = new Personnage(30, "Troll", arme2, armure1);
		
		
		/*
		 ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		 
		monstres.add(goblin);
		monstres.add(orc);
		monstres.add(troll);
		*/
		
		/*
		 for(int i = 0; i < monstres.size(); i++) {
		 
		
		while (JP.isAlive() && monstres.get(i).isAlive()) {
			
		JP.combattre(monstres.get(i));
		monstres.get(i).combattre(JP);
		
		
		}
		
		if (!monstres.get(i).isAlive()) {
			System.out.println(JP.getName()+" a gagne la combat contre "+monstres.get(i).getName());
			System.out.println("_____________________________________");
		} else {
			System.out.println(monstres.get(i).getName()+" a gagne la combat contre "+JP.getName());
			System.out.println("_____________________________________");
			System.out.println("Game Over!");
			return;
		}
		
		
		
		}*/
		
		/*
		 ArrayList<Personnage> randomMonsters = new ArrayList<Personnage>();
		 
		
		for (int i = 0; i < 10; i++) {
			Arme armeRandom = new Arme("Arme "+(i+1), (int)(Math.random() * 30));
			Armure armureRandom = new Armure("Armure "+(i+1), (int)(Math.random() * 30));
			Personnage randomMonster = new Personnage(((Math.random() * 50) + 50), "Random Monster "+(i+1), armeRandom, armureRandom);
			randomMonsters.add(randomMonster);
		}
		
		System.out.println(randomMonsters.toString());
			
		for(int i = 0; i < randomMonsters.size(); i++) {
			Combat nouveauCombat = new Combat(JP, randomMonsters.get(i));
			nouveauCombat.resoudreCombat();
		}
		*/
		
		
		Donjon nebeulheuk = new Donjon();
		nebeulheuk.explorerDonjon(JP);
		
		
		}
		
		

	}

