/******************************************************************************

Demo Math class makeup
Khanon Curtis
2/26/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.println(5 * 5 * 5 * 5);
		System.out.println(Math.pow(5,4));
		
		System.out.print("Enter the circles radius: ");
		double radius = input.nextDouble();
		
		System.out.print("Circle's area: ");
		System.out.println(Math.PI * Math.pow(radius,2));
		
		System.out.println("\nExamples of Square root");
		System.out.println(Math.sqrt(25));
		
		System.out.print("Enter a number to square: ");
		int num1 = input.nextInt();
		
		System.out.println(Math.sqrt(num1));
		int x = 23;
		int y = 8;
		
		System.out.println("\nExamples of Math.nax(x,y)");
		System.out.println(Math.max(x,y));
		System.out.println(Math.min(x,y));
		
	}
}
