/******************************************************************************

3PIN Loop
Khanon Curtis
2/11/25

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
		int att = 1;
		String pass = "purpleR";
		boolean success= true;
		
		System.out.println("Welcome to the bank of Java!");
		
		System.out.print("Please Enter your passwored: ");
		String passEntry = input.nextLine();
		
		while (passEntry != pass) {
		    if(att == 4) {
    		        System.out.println("Too many attempts, you have been locked out");
    		        success = false;
    		        break;
    		    }
		    
		    System.out.println("INCORRECT! Please try again.");
            System.out.print("Please Enter your password: ");
    		passEntry = input.nextLine(); 
    		    
    		att++;
		}
		
		if (success) {
		    att = 0;
		    
    		System.out.print("Please Enter your pin: ");
    		int pinEntry = input.nextInt(); 
    		
    		while(pinEntry != pin) {
    		    if(att == 4) {
    		        System.out.println("Too many attempts, you have been locked out");
    		        success = false;
    		        break;
    		    }
    		    System.out.println("INCORRECT! Please try again.");
                System.out.print("Please Enter your pin: ");
    		    pinEntry = input.nextInt(); 
    		    
    		    att++;
    		} 
    		
    		if (success) {
    		System.out.printf("CORRECT PIN! Your account balance is: %.02f", bal);
		    }
		}
	}
}
