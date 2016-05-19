/*
 * child class of Character and parent class for all attack based monsters in game.
 * More sub-species of Monster will be implemented once the basic game is finished
 */
public class Monster extends Character{
	
	public Monster(int charId, int start, int r, int c){
		super(charId, start, r, c);
		
	}

	
	public void attack(){
		
	}
	
	public void heal(int health){
		if(health + currentHealth <= startHealth)
			currentHealth += health;
		else
			currentHealth = startHealth;
	}
	
	public void hurt(int health){
		if(currentHealth - health > 0)
			currentHealth-= health;
		else
			death();
	}

	public void death() {
		
		
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
