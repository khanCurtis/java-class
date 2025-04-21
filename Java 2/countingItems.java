/******************************************************************************

countingItems
Khanon Curtis
4/21/25

*******************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int[] countingItems = new int[10];
		
		System.out.print("Array: ");
		for (int i = 0; i < countingItems.length; i++) {
		    countingItems[i] = 1 + r.nextInt(50);
		    
		    System.out.print(countingItems[i] + " ");
		}
		
		System.out.print("\nValue to find: ");
		int search = input.nextInt();
		
		int count = 0;
		for (int num : countingItems) {
		    if (num == search) {
		        count++;
		    }
		}
		
		System.out.printf("\n%d was found %d times", search, count);
		
	}
}
