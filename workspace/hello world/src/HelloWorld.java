
public class HelloWorld {

	public static void main (String[] args){
		
		Player player1 = new Player("steven");
		
		

			player1.x = 5;
			player1.y = 3;
			
			player1.printNameAndPosition();
		
		
		Player player2 = new Player ("niceGuy69");
		
			player2.x =5;
			player2.y = 3;
			player2.printNameAndPosition();
			
		
		
		Player player3 = new Player("billy");
		

			player3.x =5;
			player3.y = 3;
			player3.printNameAndPosition();
			
		
	}
	
	static int sum(int x, int y){
		
		
		
		return x+y;
	}
	
	static int multiply(int x, int y){
		
		return(x * y);
	}
	
}
