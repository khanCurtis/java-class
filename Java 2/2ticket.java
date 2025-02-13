/******************************************************************************

2 Concert Ticket
Khanon Curtis
2/11/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int ga = 40;
	    int rs = 60;
	    
	    System.out.printf("Select your concert seating: \n\t1  General Admission  $%d \n\t2  Reserved Seating   $%d\n", ga, rs);
	    int type = input.nextInt();
	    
	    System.out.print("How many seats would you like to purchase? ");
	    int amt = input.nextInt();
	    
	    if (type == 2) {
	        int total = rs * amt;
	        System.out.printf("The cost of your Reserved Concert seat(s) is $%d", total);
	    } else {
	        int total = ga * amt;
	        System.out.printf("The cost of your General Admission ticket(s) is $%d", total);
	    }
	    
	}
}
