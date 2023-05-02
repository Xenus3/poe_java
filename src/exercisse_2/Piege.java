package exercisse_2;

import java.util.Random;

public class Piege extends Evenement{
	
	private int degats;
	
	
	public Piege (Personnage hero, int degats) {
		super(hero);
		this.degats = degats;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	@Override
	public void resoudre() {
		
		Random rand = new Random();
		boolean moreHP = false;
		boolean lessHP = false;
		
		if(rand.nextInt(11) < 5) {
		
			hero.setHp(hero.getHp() - this.getDegats());
			lessHP = true;
		} else {
			
			hero.setHp(hero.getHp() + this.getDegats());
			moreHP = true;
		}
		
		if(hero.isAlive() && lessHP) {
			System.out.println(hero.getName()+" a survecu au piege, mais a perdu "+this.getDegats()+" points de vie");
			System.out.println("_____________________________________");
		}else if(hero.isAlive() && moreHP) {
			System.out.println(hero.getName()+" a survecu au piege, mais a gagne "+this.getDegats()+" points de vie");
			System.out.println("_____________________________________");
		}else {
			System.out.println(hero.getName()+" est mort a cause du piege");
			System.out.println("_____________________________________");
		}
		
	}
	
	
	

}
