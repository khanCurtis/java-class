/******************************************************************************

prntGrade
Khanon Curtis
2/27/25

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public static void printGrade(double grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("The grade is A");
        } else if (grade >= 80 && grade <= 89.99) {
            System.out.println("The grade is B");
        } else if (grade >= 70 && grade <= 79.99) {
            System.out.println("The grade is C");
        } else if (grade >= 60 && grade <= 69.99) {
            System.out.println("The grade is D");
        } else {
            System.out.println("The grade is F");
        }
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Score: ");
		double score = input.nextDouble();
		
		printGrade(score);
		
	}
}
