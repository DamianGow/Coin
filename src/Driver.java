import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	   static Scanner scnr = new Scanner(System.in);
	   public static void main(String[] args) {
		   String coinResults = "";

		   
		   try {
		   System.out.println("Your current coin is silver, input 'y' to switch, otherwise, input anything else");
		   String switchChoice = scnr.next();
		   if (switchChoice.equals("y")) {
			   Game.switchCoin();
		   }
		   else if (switchChoice.equals("Easter")) {
			   Game.secret();
		   }
		   
		   System.out.println("Enter how many coinflips you would like to do, choosing 1 will show an image.");
		   int flipTotal = flip();
		 
		   
		   Game.flipMultiple(flipTotal);
		   } catch (InputMismatchException e) {
			   System.out.println("You inputted something incorrectly, please try again");
		   }
	   }
	   
	   public static int flip() {
		   
		   int x =  scnr.nextInt();
		   return x;
	   }
}
//test