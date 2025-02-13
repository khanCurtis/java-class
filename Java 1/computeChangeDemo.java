/******************************************************************************

Demo Compute Change
Khanon Curtis
2/26/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//STEP ONE: Input the $ amount
		System.out.print("Please enter a dollar amount (EXAMPLE: 11.67): $");
		double amount = input.nextDouble();
		
		//STEP TWO: Convert to pennies
		int pennies = (int)(amount * 100);
		
		//STEP THREE: Calculate Dollars
		int dollars = pennies / 100;
		pennies = pennies % 100;
		
		//STEP FOUR: Calculate Quarters
		int quarters = pennies / 25;
		pennies = pennies % 25;
		
		//STEP FIVE: Calculate Dimes
		int dimes = pennies / 10;
		pennies = pennies % 10;
		
		//STEP SIX: Calculate Nickles
		int nickles = pennies / 5;
		pennies = pennies % 5;
		
		//STEP SEVEN: Print
		System.out.printf("Your amount ($%.2f) consists of: %n%n", amount);
		System.out.printf("\t%d Dollar(s). %n", dollars);
		System.out.printf("\t%d Quarter(s). %n", quarters);
		System.out.printf("\t%d Dime(s). %n", dimes);
		System.out.printf("\t%d Nickle(s). %n", nickles);
		System.out.printf("\t%d Pennie(s). %n", pennies);
		
		
	}
}
