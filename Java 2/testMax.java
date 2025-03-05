/******************************************************************************

testMax
Khanon Curtis
3/3/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    
    public static int max(int x, int y) {
        return Math.max(x,y);
    }
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two whole numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.printf("%nThe maximum of %d and %d is %d", x, y, max(x, y));
		
	}
}
