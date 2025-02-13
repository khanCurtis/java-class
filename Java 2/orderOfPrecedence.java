/*
Order of Precedence
Khanon Curtis
1/27/25
*/

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("A = ");
int a = input.nextInt();
System.out.print("B = ");
int b = input.nextInt();
System.out.print("C = ");
int c = input.nextInt();
System.out.print("X = ");
int x = input.nextInt();
System.out.print("Y = ");
int y = input.nextInt();

int equation = (3 + 4 * x) / 5 - (10 * ((y - 5) * (a + b + c))) / x + 9 * (4 / x + ((9 + x) / y));

System.out.printf("The answer is %d", equation);

}
}
