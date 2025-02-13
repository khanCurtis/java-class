/******************************************************************************

Demo: if statements
Khanon Curtis
3/5/24

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the test score: ");
		int score = input.nextInt();
		
		if(score = 100){
		    System.out.println("Amazing work! You got a perfect score!")
		}
		
		if(score >= 80){
		    System.out.println("Congrats! You Passed!");
		    System.out.println("You MUST drive with an adult");
		    
		} else {
		    System.out.println("Study! and try again!");
		    System.out.println("You have 2 tries daily!");
		    
		}
		
		System.out.println("\nThanks for visiting Utah's DMV!");
		System.out.println("\nBuckle up and drive safely!");
		
	}
}
