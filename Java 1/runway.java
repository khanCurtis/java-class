/******************************************************************************

Runway
Khanon Curtis
2/26/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter Take-Off Speed (v): ");
		double takeoff = input.nextDouble();
		
		System.out.print("Please enter Acceleration (a): ");
		double accel = input.nextDouble();
		
		double eq1 = (Math.pow(takeoff,2));
		double eq2 = 2 * accel;
		double eq3 = eq1 / eq2;
		
		System.out.printf("The needed minimum length to take-off is: %.3f", eq3);
		
	}
}
