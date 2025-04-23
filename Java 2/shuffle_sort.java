/******************************************************************************

shuffle_sort
Khanon Curtis
4/23/25

*******************************************************************************/
import java.util.Random;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Random r = new Random();
	    
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
	        array[i] = r.nextInt(100) + 1;
		}
		
		System.out.print("Original Array: ");
		for (int num : array) {
		    System.out.print(num + " ");
		}
		
		Arrays.sort(array);
		System.out.print("\n\nSorted Array: ");
		for (int num : array) {
		    System.out.print(num + " ");
		}
		
		//Fisher-Yates alg to shuffle (cool emoji here)
		for(int i = array.length - 1; i > 0; i--) {
		    int j = r.nextInt(i + 1);
		    int temp = array[i];
		    array[i] = array[j];
		    array[j] = temp;
		}
		
		System.out.print("\n\nShuffled Array: ");
		for(int num : array) {
		    System.out.print(num + " ");
		}
		
	}
}
