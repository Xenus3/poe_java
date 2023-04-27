package exercisse_2;

public class Personnage {
	
	private double hp;
	private String nom;
	private Arme arme;
	private Armure armure;
	
	Personnage (int hp, String nom, Arme arme, Armure armure) {
		this.hp = hp;
		this.nom = nom;
		this.arme = arme;
		this.armure = armure;
		}
	
	public double getHp() {
		return hp;
	}
	
	public void setHp(double newHp) {
		this.hp = newHp;
	}
	
	public String getName() {
		return nom;
	}
	
	public void setName(String newName) {
		this.nom = newName;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public Armure getArmure() {
		return armure;
	}

	public void setArmure(Armure armure) {
		this.armure = armure;
	}
	
	public boolean isAlive() {
		return this.getHp() > 0;
	}
	
	public void combattre(Personnage personnage1) {
		
		
		personnage1.setHp(personnage1.hp - (this.arme.getAttaque() - (0.1 * personnage1.armure.getDefense())));
		if(personnage1.getHp() < 0) {
			personnage1.setHp(0);
			
		} 
		System.out.println("points de vie de "+personnage1.nom+" : "+personnage1.getHp());
		
		
		
	
	}
}
