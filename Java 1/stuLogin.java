/******************************************************************************

stuLogin
Khanon Curtis
4/23/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fname = input.nextLine();
		fname = fname.toLowerCase();
		
		System.out.print("Enter your last name: ");
		String lname = input.nextLine();
		lname = lname.toLowerCase();
		
		String stuLogin = lname.substring(0, 5) + fname.substring(0, 3) + "000";
		
		System.out.println(stuLogin);
	}
}
