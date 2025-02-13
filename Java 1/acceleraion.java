/******************************************************************************

Acceleration
Khanon Curtis
2/12/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter starting velocity (v0) in meters/second: ");
		double v0 = input.nextDouble();
		System.out.print("Enter ending velocity (v1) in meters/second: ");
		double v1 = input.nextDouble();
		System.out.print("Enter Time (t) in seconds: ");
		double t = input.nextDouble();
		
		double avgAccel = (v1 - v0) / t;
		
		System.out.printf("%nThe average acceleration is %.4f", avgAccel);
	}
}
