/******************************************************************************

checkAge
Khanon Curtis
2/27/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied -- You are not old enough!");
        } else {
            System.out.println("Access granted -- You are old enough!");
        }
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int userAge = input.nextInt();
		
		checkAge(userAge);
		
	}
}
