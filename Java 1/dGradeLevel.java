/******************************************************************************

DGrade Level
Khanon Curtis
3/18/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How old are you? ");
		int age = input.nextInt();
		
		if(age >= 3 && age < 5)
		    System.out.print("You\'re in preschool!");
		    
	    if(age == 5)
		    System.out.print("You\'re in kindergarten!");
		    
	    if(age >= 6 && age <= 11)
		    System.out.print("You\'re in elementary!");
		    
	    if(age >= 12 && age <= 13)
		System.out.print("You\'re in middle school!");
		
        if(age >= 14 && age <= 18)
    	    System.out.print("You\'re in high school!");
    	    
        if(age < 3 || age > 18)
            System.out.print("You entered an invalid age.");
    	
	}
}
