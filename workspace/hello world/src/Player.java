
public class Player {

	public int x; 
	public int y;
	public String name;
	public static String lastName = "2"+"2+2";
	
	
	Player(String newName ){
		
		
		
		
		name = newName;
	}
	
	void printNameAndPosition(){
		
		System.out.println(name+" "+lastName+": ("+x+","+y+")");
		
		
	    
		
	}
}