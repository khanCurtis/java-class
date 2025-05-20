/******************************************************************************

1distN
Khanon Curtis
5/15/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
		ArrayList<Integer> numList = new ArrayList<>();
		
		System.out.print("Enter whole numbers (0 to end) ");
		
		int num;
		do {
		    num = input.nextInt();
		    if (num != 0) {
		        numList.add(num);
		    }
		} while (num != 0);
		
		for (int i = 0; i < numList.size(); i++) {
		    System.out.print(numList.get(i));
		    if (i < numList.size() - 1) {
		        System.out.print("  ");
		    }
		}
	}
}
