package exercisse_2;

public class Main {

	public static void main(String[] args) {
		
		

		Personnage hero = new Personnage(200, Data.genererNom(), Data.randomArmes[2], Data.randomArmures[2]);
		
		System.out.println(hero.toString());
		
		Donjon nebeulheuk = new Donjon();
		nebeulheuk.genererDonjon();
		nebeulheuk.explorerDonjon(hero);
		
		
		}
		
		

	}

