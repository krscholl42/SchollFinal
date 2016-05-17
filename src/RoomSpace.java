/*
 * child of Space that designates places where Characters and Items can be placed. 
 */
public class RoomSpace extends Space{
	private Character[] contains;
	private int index;
	
	public RoomSpace(int r, int c){
		super(r,c);
		isFull = false;
		contains = new Character[3];
		index = 0;
	}
	
	public boolean isSpaceFull(){
		// checks to see if there is one player, one monster, or two items in the space. If yes, returns true. Else, returns false
		int itemCount = 0;
		isFull = false;
		for(int i = 0; i < contains.length; i++){
			if(contains[i] instanceof Monster || contains[i] instanceof Player)
				isFull = true;
			else if(contains[i] instanceof Items)
				itemCount++;
		}
		if(itemCount >= 2)
			isFull = true;
	
		return isFull;
	}
	
	public Character getFirstThing(){
		return contains[0];
	}
	
	public boolean add(Character thing){
		if(isFull == false){
			contains[index] = thing;
			index++;
			isFull = isSpaceFull();
			return true;
		}else
			return false;
	}
	
	public boolean remove(Character thing){
		for(int i = 0; i < contains.length; i++){
			if(contains[i].equals(thing)){
				contains[i] = null;
				return true;
			}
		}
		return false;
	}

}

	

	
