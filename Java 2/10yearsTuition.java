/******************************************************************************

10 years Tuition (For loop)
Khanon Curtis
2/27/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the current year: ");
		int currentYear = input.nextInt();
		
		System.out.print("Enter the current yearly tuition: ");
		double yearlyTuition = input.nextDouble();
		
		System.out.print("Enter the current projected rate of increase: ");
		double projectedROI = input.nextDouble();
		
		System.out.println("YEAR\tTUITION");
		for(int i = 0; i < 10; i++) {
		    System.out.printf("%d\t$%,.2f\n", currentYear, yearlyTuition);
		    double increase = yearlyTuition * projectedROI;
		    yearlyTuition += increase;
		    currentYear++;
		}
	}
}
