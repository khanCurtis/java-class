/******************************************************************************

for-eachLoop
Khanon Curtis
3/21/25

*******************************************************************************/
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		String [] cars = {"Nissan", "Honda", "Ford", "BMW", "Toyota", "Tesla"};
		
		/*for(int i = 0; i < cars.length; i++) {
		    System.out.println(cars[i]);
		}*/
		    
		//for-each loop
		for(String i : cars) {
		    System.out.println(i);
		}
		
		//sort arrays
		int [] arr = {13, 26, 5, 754, 75, 56, 35, 543};
		Arrays.sort(arr, 1, 5); //starts at position 1 and ends at pos 5
		
		//Arrays.sort(arr); //sorts array using Array class and method
		for(int i : arr) {
		
		    System.out.print(i + " ");
		}
		
	}
}
