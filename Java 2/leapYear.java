/*
Khanon Curtis
Leap Year w/ Ternary Operators
2/11/25
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
/*
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            System.out.printf("%d IS a leap year!", year);
        else
            System.out.printf("%d IS NOT a leap year!", year);
*/
        System.out.println((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? year + " IS a leap year!" : year + " IS NOT a leap year");




    }
}
