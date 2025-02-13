/*
Lottery
Khanon Curtis
2/4/25
 */
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10, 99);
        System.out.println(num);

        System.out.print("Enter your lottery pick (2 digit): ");
        int pick = input.nextInt();

        int n1 = num / 10;
        int n2 = num % 10;
        int p1 = pick / 10;
        int p2 = pick % 10;

        System.out.printf("The number is %d %n", num);
        if (pick == num) {
            System.out.println("Exact Match! You win $10,000!!");
        } else if (n1 == p2 && n2 == p1) {
            System.out.println("Double Digit Match! You win $3,000!");
        } else
            if (n1 == p2 ^ n2 == p1) {
            System.out.println("Single Digit Match! You win $1,000!");
        } else if (pick != num) {
            System.out.println("No match.");
        }

    }
}
