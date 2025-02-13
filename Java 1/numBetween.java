/******************************************************************************

numBetween
Khanon Curtis
4/23/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Starting Value: ");
		int start = input.nextInt();
		
		System.out.print("Enter Ending Value: ");
		int end = input.nextInt();
		
		while(start <= end){
		    System.out.println(start);
		    start++;
		}
		
	}
}
