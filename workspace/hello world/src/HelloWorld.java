
import java.util.Scanner;
public class HelloWorld {

	
	public static void main (String[] args){
	
	Scanner takeNum = new Scanner(System.in);
		
		int counter=1;
		long total =0;
		long grade;
		long average = 0;
		
		while(counter <= 5  ){
			System.out.println(counter+":"	+ "");
		grade = takeNum.nextInt();
		
		total = total + grade;
 		counter++;}
 		 average= total/5;
		
	
		System.out.println("The Average: "+average);
		
		
		
	}	
		
		
	
		
		
	/*	Player player1 = new Player("steven");
	
		

		player1.x = 5;
		player1.y = 3;
			
		
		
		Player player2 =new Player("Joshua");
		
		player2.lastName = "murphy";
		
		
		player1.printNameAndPosition();
		player2.printNameAndPosition();
		
		player2.x = 12;
		player2.y = 8;
	
		
		Player player3 = new Player("David");
		
		player3.lastName = "tom";
		player3.x =5;
		player3.y = 3;
		
		player3.printNameAndPosition();
		player1.printNameAndPosition();
		player2.printNameAndPosition();
		

		
		player3.printNameAndPosition();
		player1.printNameAndPosition();
		player2.printNameAndPosition();
		
	}*/
		  
		 
			}
	
	



