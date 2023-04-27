package exercisse_2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random() * 50) + 50;  // random 50 to 100
		int randomNum2 = (int)(Math.random() * 30);  // random 0 to 30

		
		Arme arme1= new Arme("Epee Rouillé", 20);
		Arme arme2 = new Arme("Masse", 30);
		Arme randomArme = new Arme("arme",  randomNum2);
		
		Armure armure1 = new Armure("Armure en carton", 10);
		Armure armure2 = new Armure("Armure en carton renforcé", 15);
		Armure randomArmure = new Armure("armure",  randomNum2);
		
		Personnage JP = new Personnage(200, "Jean Paul", arme1, armure1);
		Personnage goblin = new Personnage(40, "Goblin", arme2, armure2);
		Personnage orc = new Personnage(20, "Orc", arme1, armure2);
		Personnage troll = new Personnage(30, "Troll", arme2, armure1);
		
		
		ArrayList<Personnage> monstres = new ArrayList<Personnage>();
		monstres.add(goblin);
		monstres.add(orc);
		monstres.add(troll);
		
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
		
		ArrayList<Personnage> randomMonsters = new ArrayList<Personnage>();
		
		for (int i = 0; i < 10; i++) {
			Personnage randomMonster = new Personnage(randomNum, "Random Monster", randomArme, randomArmure);
			randomMonsters.add(randomMonster);
		}
			
			for(int j =0; j < randomMonsters.size(); j++) {
		
			 while(JP.isAlive() && randomMonsters.get(j).isAlive()) {
				 
					
					JP.combattre(randomMonsters.get(j));
					randomMonsters.get(j).combattre(JP);
					
					
					}
				
				if (!randomMonsters.get(j).isAlive() && JP.isAlive()) {
					System.out.println(JP.getName()+" a gagne la combat contre "+randomMonsters.get(j).getName());
					System.out.println("_____________________________________");
					
				} else if (!JP.isAlive() && randomMonsters.get(j).isAlive()) {
					System.out.println(randomMonsters.get(j).getName()+" a gagne la combat contre "+JP.getName());
					System.out.println("_____________________________________");
					System.out.println("Game Over!");
					return;
				} else if (!JP.isAlive() && !randomMonsters.get(j).isAlive()){
					System.out.println("Double ko !");
					return;
					
		}
		
		
		
		}
		
		

	}

}
