/******************************************************************************

validEmail
Khanon Curtis
4/23/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your email address: ");
		String email = input.nextLine();
		
		email.toLowerCase();
		
		if(email.contains("@")){
		    System.out.println("This is a(n) Valid Email.");
		}else{
		    System.out.println("This is NOT a(n) Valid Email.");
		}
	}
}
