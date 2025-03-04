/******************************************************************************

grdReturn
Khanon Curtis
3/3/25

*******************************************************************************/
import java.util.Scanner;
public class Main {
    
	public static char getGrade(double grade) {
	    char letter;
	    
        if (grade >= 90 && grade <= 100) {
            letter = 'A';
        } else if (grade >= 80 && grade <= 89.99) {
            letter = 'B';
        } else if (grade >= 70 && grade <= 79.99) {
            letter = 'C';
        } else if (grade >= 60 && grade <= 69.99) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        return letter;
    }
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Score: ");
		double score = input.nextDouble();
		
		System.out.println("The grade is: " + getGrade(score));
		
	}
}
