
public class Player {

	public int x = 0;
	public int y = 0;
	public String name;
	
	Player(String newName ){
		
		name = newName;
	}
	
	void printNameAndPosition(){
		
		System.out.println(name+": ("+x+","+y+")");
		
		
	    
		
	}
}