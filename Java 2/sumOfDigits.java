/*
Sum Of Digits
Khanon Curtis
1/31/25
*/
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number between 1 and 1000: ");
int num = input.nextInt();

int sum = 0;
while(num != 0) {
int rem = num % 10;
sum += rem;
num /= 10;
}

System.out.println(sum);

/*
//getting 22 instead of 6 when putting 123
int hund = num / 100;
int remain = num % 100;
int tens = remain / 2;
int ones = tens & 10;

int equ = hund + tens + ones;

System.out.println(equ);
*/


}
}
