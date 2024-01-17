import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	   static Scanner scnr = new Scanner(System.in);
	   public static void main(String[] args) {
		   try {
			   printLine.print("Your current coin is silver, input 'y' to switch, otherwise, input a number of times to flip");
		   String switchChoice = scnr.next();
		   if (switchChoice.equals("y")) {
			   Game.switchCoin();
		   }
		   else if (switchChoice.equals("Easter")) {
			   Game.secret();
		   }
		   else {
			   int flipTotal = flip();
			   Game.flipMultiple(flipTotal);
		   }
		   } catch (InputMismatchException e) {
			   printLine.print("You inputted something incorrectly, please try again");
		   }
	   }
	   
	   public static int flip() {
		   
		   int x =  scnr.nextInt();
		   return x;
	   }
}
