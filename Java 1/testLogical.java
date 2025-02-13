/******************************************************************************

testLogical
Khanon Curtis
3/20/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		if(num % 2 == 0 && num % 3 == 0)
		    System.out.printf("\n%d is divisible by 2 and 3.", num);
		    
		if(num % 2 != 0 && num % 3 != 0)
		    System.out.printf("\n%d is not divisible by 2 and 3.", num);
		
		if(num % 2 == 0 || num % 3 == 0)
		    System.out.printf("\n%d is divisible by 2 or 3.", num);
		    
		if(num % 2 != 0 ^ num % 3 != 0)
		    System.out.printf("\n%d is divisible by 2 or 3 but not both.", num);
	}
}
