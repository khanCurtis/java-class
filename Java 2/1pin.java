/******************************************************************************

1PIN Loop
Khanon Curtis
2/6/25

*******************************************************************************/
import java.util.Scanner;
import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		double bal = rand.nextDouble(1000);
		int pin = 1357;
		
		System.out.println("Welcome to the bank of Java!");
		
		System.out.print("Please Enter your pin: ");
		int entry = input.nextInt(); 
		
		while(entry != pin) {
		    System.out.println("INCORRECT! Please try again.");
            System.out.print("Please Enter your pin: ");
		    entry = input.nextInt(); 
		} 
		System.out.printf("CORRECT PIN! Your account balance is: %.02f", bal);
	}
}
