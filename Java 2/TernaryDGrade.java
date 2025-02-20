/******************************************************************************

DGrade (Nested using Ternary)
Khanon Curtis
2/19/25

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter your grade:  ");
        int grade = input.nextInt();
        
        System.out.println((grade >=90) ? "You earned an A grade!" : (grade >= 80) ? "You earned a B grade!" : (grade >= 70) ? "You earned a D grade!" : "You\'re grade is F.");
        
        /*
        if (grade >= 90){
            System.out.println("You earned an A grade!!!!!!");
            System.out.println("Good job!");
        } else if (grade >= 80) {
            System.out.println("You earned a B grade!");
        } else if (grade >= 70) {
            System.out.println("You earned a C grade!"); 
        } else if (grade >= 60){
            System.out.println("You earned a D grade!");
        } else {
            System.out.println("Your grade is F.");
        }           
        */
    }
    
}
