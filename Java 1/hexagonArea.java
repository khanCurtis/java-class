/******************************************************************************

Hexagon Area
Khanon Curtis
2/26/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the side of the Hexagon (s): ");
		double side = input.nextDouble();
		
		double area = 3 * (Math.sqrt(3) / 2 * (Math.pow(side,2))); //need help
		
		System.out.printf("The area is %.4f", area);
		
	}
}
