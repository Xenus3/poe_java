package exercisse_2;

import java.util.Random;

public class Data {
	
	
	
	public static final String[] listeAdjectifs = {"De pierre", "Robuste", "En carton", "Rouille", "En fer", "En bois"};
	public static final String[] listeNomsPerso = {"Alfred", "Jose", "Herbert", "Robert", "Dammian", "Anais", "Samuel"};
	public static final String[] listeNomsArme = {"Epee", "Massue", "Gourdin", "Katana"};
	public static final String[] listeNomsArmure = {"fer", "tissus", "carton", "maille"};
	public static final Arme[] randomArmes = {
			new Arme(Data.genererNomArmes(), 1, 1),
			new Arme(Data.genererNomArmes(), 1, 2),
			new Arme(Data.genererNomArmes(), 1, 3),
			new Arme(Data.genererNomArmes(), 1, 4),
			new Arme(Data.genererNomArmes(), 1, 5),
			new Arme(Data.genererNomArmes(), 1, 6),
			new Arme(Data.genererNomArmes(), 1, 7),
			new Arme(Data.genererNomArmes(), 1, 8),
			new Arme(Data.genererNomArmes(), 1, 9),
			new Arme(Data.genererNomArmes(), 1, 10)
	};
	public static final Armure[] randomArmures = {
			new Armure(Data.genererNomArmures(), 1, 1),
			new Armure(Data.genererNomArmures(), 1, 2),
			new Armure(Data.genererNomArmures(), 1, 3),
			new Armure(Data.genererNomArmures(), 1, 4),
			new Armure(Data.genererNomArmures(), 1, 5),
			new Armure(Data.genererNomArmures(), 1, 6),
			new Armure(Data.genererNomArmures(), 1, 7),
			new Armure(Data.genererNomArmures(), 1, 8),
			new Armure(Data.genererNomArmures(), 1, 9),
			new Armure(Data.genererNomArmures(), 1, 10)
	};
	
	public static String genererNom() {
		
		Random rand = new Random();
		return Data.listeNomsPerso[rand.nextInt(Data.listeNomsPerso.length)]
				+" "
				+Data.listeAdjectifs[rand.nextInt(Data.listeAdjectifs.length)];
		
	}
	
	public static String genererAssociation(String[] tableau1, String[] tableau2) {
		Random rand = new Random();
		return tableau1[rand.nextInt(tableau1.length)]
				+" "
				+tableau2[rand.nextInt(tableau2.length)];
	}
	
	public static String genererNomArmes( ) {
		return genererAssociation(listeNomsArme, listeAdjectifs);
	}
	
	public static String genererNomArmures() {
		return genererAssociation(listeNomsArmure, listeAdjectifs);
	}

}
