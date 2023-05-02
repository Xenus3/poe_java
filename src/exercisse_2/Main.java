package exercisse_2;

public class Main {

	public static void main(String[] args) {
		
		

		Personnage hero = new Personnage(200, Data.genererNom(), Data.randomArmes[2], Data.randomArmures[2]);
		
		System.out.println(hero.toString());
		System.out.println("________________________________");
		
		Donjon nebeulheuk = new Donjon( 10, hero);
		
		nebeulheuk.explorerDonjon();
		
		
		}
		
		

	}

