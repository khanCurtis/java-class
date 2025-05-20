/******************************************************************************

numList
Khanon Curtis
5/15/25

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> numList =
		    new ArrayList<>(Arrays.asList(5, 22, 79, 45, 63));
		
		System.out.println(numList);
		
		numList.add(15);
		System.out.println(numList);
		
		double total = 0;
		for(int i = 0; i < numList.size(); i++) {
		    total += numList.get(i);
		}
		
		System.out.println("Total: " + total);
		System.out.println("Average: " + total / numList.size());
		
	}
}
