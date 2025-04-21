/******************************************************************************

analyzeNumbers
Khanon Curtis
4/9/25

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of items: ");
		int numItems = input.nextInt();
		double[] numbers = new double[numItems];
		double total = 0;
		
		System.out.println("\nEnter the numbers: ");
		for (int i = 0; i < numItems; i++) {
		    numbers[i] = input.nextDouble();
		    total += numbers[i];
		}
		
		double average = total / numItems;
		System.out.printf("\nAverage: %.1f\n", average);
		
		int count = 0;
		for (double num : numbers) {
		    if (num > average) {
		        count++;
		    }
		}
		
		System.out.println("Number of elements greater than average: " + count);
		
	}
}
