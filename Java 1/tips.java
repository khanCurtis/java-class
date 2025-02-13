/******************************************************************************

Tips
Khanon Curtis
2/13/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter Subtotal: ");
		double subtotal = input.nextDouble();
		System.out.print("Enter Gratuity Rate (WHOLE NUMBER): ");
		int rate = input.nextInt();
		
		double tip = subtotal * rate;
		double realTip = tip / 100;
		double total = subtotal + realTip;
		
		System.out.printf("The gratuity is %f and the total is %f", realTip, total);
		
	}
}
