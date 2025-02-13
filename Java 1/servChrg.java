/******************************************************************************

servChrg
Khanon Curtis
3/10/24

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Please enter check amount: ");
		double amt = input.nextDouble();
		
		double less = amt + 1;
		double more = amt * 0.1;
		
		if(amt < 10){
		    System.out.printf("\nThe service charge for cashing a $%.2f is $1.00", amt);
		} else {
		    System.out.printf("\nThe service charge for cashing a $%.2f is $%.2f", amt, more);
		}
		System.out.printf("\nThank you for using RHS Check Service!");
	}
}
