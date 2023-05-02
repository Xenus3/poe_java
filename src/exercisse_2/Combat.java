package exercisse_2;



public class Combat extends Evenement {
	
	
	private Personnage enemmi;
	
	
	Combat(Personnage hero, Personnage enemmi) {
		super(hero);
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
		
		
		
		
			
		
		}


	@Override
	public void resoudre(Personnage hero) {
		while(hero.isAlive() && enemmi.isAlive()) {
			 
			
			hero.combattre(enemmi);
			enemmi.combattre(hero);
			
			
			}
		
		if (!enemmi.isAlive() && hero.isAlive()) {
			System.out.println(hero.getName()+" a gagne la combat contre "+enemmi.getName());
			System.out.println(hero.getName()+" a loote "+enemmi.getArme().nom+" et "+enemmi.getArmure().nom);
				if(enemmi.getArme().getAttaque() > hero.getArme().getAttaque()) {
					enemmi.getArme().utiliser(hero);
					System.out.println(hero.getName()+" a equipe "+enemmi.getArme().nom);
				} else if (enemmi.getArmure().getDefense() > hero.getArmure().getDefense()) {
					enemmi.getArmure().utiliser(hero);
					System.out.println(hero.getName()+" a equipe "+enemmi.getArmure().nom);
				} else {
					hero.getInventaire().add(enemmi.getArme());
					hero.getInventaire().add(enemmi.getArmure());
				}
				System.out.println("_____________________________________");
			
		} else if (!hero.isAlive() && enemmi.isAlive()) {
			System.out.println(enemmi.getName()+" a gagne la combat contre "+hero.getName());
			System.out.println("_____________________________________");
			System.out.println("Game Over!");
			
		} else if (!hero.isAlive() && !enemmi.isAlive()){
			System.out.println("Double ko !");
			
			
}

		for (Objet objet : hero.getInventaire()) {
			System.out.println(objet.nom);
		}
		
	}
	
	
	}
	
	
	


