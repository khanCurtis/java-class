/******************************************************************************

drivingCost
Khanon Curtis
2/12/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the driving distance in miles: ");
		double distance = input.nextDouble();
		System.out.printf("Enter the miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.printf("Enter the price per gallon: $");
		double ppg = input.nextDouble();
		
		double needed = distance / mpg;
		double fuelCost = ppg * needed;
		System.out.printf("%nThe cost of driving %.1f miles is $ %.2f %nGallons of gas needed is %.1f", distance, fuelCost, needed);
	}
}
