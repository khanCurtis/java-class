/*
Demo Ternary operators and statements
Khanon Curtis
2/4/25
*/

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = input.nextInt();

/*
if (age >= 16) {
System.out.println("You can drive!");
} else {
System.out.println("You cannot drive.");
}
*/

System.out.println((age >= 16) ? "You can drive!" : "You cannot drive.");

}
}
