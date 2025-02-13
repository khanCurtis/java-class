/******************************************************************************

simpleIf
Khanon Curtis
3/14/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		if(num % 5 == 0){
		    System.out.println("HiFive");
		}
		if(num % 2 == 0){
		    System.out.println("HiEven");
		} else {
		    System.out.println("HiOdd");
		}
		
	}
}
