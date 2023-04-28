package exercisse_2;



public class Combat {
	
	private Personnage hero;
	private Personnage enemmi;
	
	
	Combat(Personnage hero, Personnage enemmi) {
		this.hero = hero;
		this.enemmi = enemmi;
	}


	public Personnage getHero() {
		return hero;
	}


	public void setHero(Personnage hero) {
		this.hero = hero;
	}


	public Personnage getEnemmi() {
		return enemmi;
	}


	public void setEnemmi(Personnage enemmi) {
		this.enemmi = enemmi;
	}
	
	
	public void resoudreCombat() {
		
		
		
		
			while(hero.isAlive() && enemmi.isAlive()) {
				 
					
					hero.combattre(enemmi);
					enemmi.combattre(hero);
					
					
					}
				
				if (!enemmi.isAlive() && hero.isAlive()) {
					System.out.println(hero.getName()+" a gagne la combat contre "+enemmi.getName());
					System.out.println("_____________________________________");
					
				} else if (!hero.isAlive() && enemmi.isAlive()) {
					System.out.println(enemmi.getName()+" a gagne la combat contre "+hero.getName());
					System.out.println("_____________________________________");
					System.out.println("Game Over!");
					return;
				} else if (!hero.isAlive() && !enemmi.isAlive()){
					System.out.println("Double ko !");
					return;
					
		}
		
		
		
		}
	}
	
	
	


