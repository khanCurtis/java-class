/******************************************************************************

Distance Between Points
Khanon Curtis
2/27/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double sumX = (x2 - x1);
		double sumY = (y2 - y1);
		double powX = Math.pow(sumX,2);
		double powY = Math.pow(sumY,2);
		double sumPow = powX + powY;
		double dist = Math.sqrt(sumPow);
		
		System.out.printf("The distance between the two points is: %.5f", dist);
	}
}
