/******************************************************************************

largestValue
Khanon Curtis
5/20/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Number of Values to enter: ");
		int count = input.nextInt();
		
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < count; i++) {
		    numList.add(r.nextInt(100) + 1);
		}
		
		System.out.println(numList);
		System.out.println();
		
		int largest = numList.get(0);
		int largestIndex = 0;
		int smallest = numList.get(0);
		int smallestIndex = 0;
		
		for (int i = 1; i < numList.size(); i++) {
		    if (numList.get(i) > largest) {
		        largest = numList.get(i);
		        largestIndex = i;
		    }
		    if (numList.get(i) < smallest) {
		        smallest = numList.get(i);
		        smallestIndex = i;
		    }
		}
		
		System.out.printf("Largest Value: %d\nIndex: %d\n\nSmallest Value: %d\nIndex: %d", largest, largestIndex, smallest, smallestIndex);
		
	}
}
