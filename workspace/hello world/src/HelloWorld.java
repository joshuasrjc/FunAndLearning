
import java.util.Scanner;
public class HelloWorld {

	
	public static void main (String[] args){
	
		
		Player player1 = new Player("steven");
	
		player1.printNameAndPosition();

		player1.x = 5;
		player1.y = 3;
			
		player1.printNameAndPosition();
		
		Player player2 =new Player("Joshua");
		
		player2.x = 12;
		player2.y = 8;
		player2.printNameAndPosition();
		
		
		Player player3 = new Player("David");
		

		player3.x =5;
		player3.y = 3;
		player3.printNameAndPosition();
		
		
		
		
		
	
			}

	
}
