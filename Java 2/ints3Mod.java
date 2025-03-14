/******************************************************************************

ints3 MODIFIED
Khanon Curtis
3/5/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static int sum (int x, int y, int z) {
	    return x + y + z;
	}
	
	public static double average (int x, int y, int z) {
	    return (x + y + z) / 3.0;
	}
	
	public static int smallest (int x, int y, int z) {
	    int smaller = 0;
	    
	    if (z < y && z < x) {
	        smaller = z;
	    } else if (y < x && y < z) {
	        smaller = y;
	    } else if (x < y && x < z) {
	        smaller = x;
	    } 
	    
	    return smaller;
	}
	
	public static int largest (int x, int y, int z) {
	    int greater = 0;
	    
	    if (z > y && z > x) {
	        greater = z;
	    } else if (y > x && y > z) {
	        greater = y;
	    } else if (x > y && x > z) {
	        greater = x;
	    } 
	    
	    return greater;
	}
	
	public static boolean consec(int x, int y, int z) {
	    boolean con;
	    if (y == x++ && z == y++) {
	        con = true;
	    } else {
	        con = false;
	    }
	    return con; //FIXME: Saying false when typing 5, 6, 7
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 whole numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		System.out.println("\nSum: " + sum(x,y,z));
		System.out.printf("Average: %.2f", average(x,y,z));
		System.out.println("\nSmallest number: " + smallest(x,y,z));
		System.out.println("Largest number: " + largest(x,y,z));
		System.out.println("Consecutive: " + consec(x,y,z));
	}
}
