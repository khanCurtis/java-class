/******************************************************************************

3 Concert Ticket
Khanon Curtis
2/13/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double ga = 40;
	    double rs = 60;
	    
	    System.out.printf("Select your concert seating: \n\t1  General Admission  $%.2f \n\t2  Reserved Seating   $%.2f\n", ga, rs);
	    int type = input.nextInt();
	    
	    System.out.print("How many seats would you like to purchase? ");
	    int amt = input.nextInt();
	    
	    System.out.println("Are you currently a student? \n\t1  High School Student   4% discount \n\t2  College/University Student   2% discount \n\t3  N/A");
	    int disc = input.nextInt();
	    
	    if (disc == 1) {
	        double gaDec = ga * .04;
	        ga -= gaDec;
	        
	        double rsDec = rs * .04;
	        rs -= rsDec;
	        
	    } else if (disc == 2) {
	        double gaDec = ga * .02;
	        ga -= gaDec;
	        
	        double rsDec = rs * .02;
	        rs -= rsDec;
	    } 
	    
	    if (type == 2) {
	        double total = rs * amt;
	        System.out.printf("The cost of your Reserved Concert seat(s) is $%.2f", total);
	    } else {
	        double total = ga * amt;
	        System.out.printf("The cost of your General Admission ticket(s) is $%.2f", total);
	    }
	    
	}
}
