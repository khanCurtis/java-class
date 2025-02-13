/******************************************************************************

1 Concert Ticket
Khanon Curtis
2/11/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Select your concert seating: \n\t1  General Admission  $40 \n\t2  Reserved Seating   $60");
	    int type = input.nextInt();
	    
	    if (type == 2) {
	        System.out.println("The cost of your Reserved Concert seat is $60");
	    } else {
	        System.out.println("The cost of your General Admission ticket is $40");
	    }
	    
	}
}
