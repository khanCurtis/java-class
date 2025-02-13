/*Day 1: DEMO REVIEW: Printing, Scanner, Basic Calculations
* Khanon Curtis
* 1/23/2025*/
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Please enter your name: ");
String name = input.nextLine();

System.out.println("Please enter the radius of your circle: ");
float radius = input.nextFloat();

final double PI = 3.14159;
//double area = PI * radius * radius;
double area = PI * Math.pow(radius, 2);
double perimeter = 2 * radius * PI;

System.out.printf("Hello %s!%n", name);

System.out.println(10 / 2); //5
System.out.println(10 / 3); //3
System.out.println(10 / 3.0); //3.333
System.out.println(10 % 2); //0
System.out.println(10 % 1); //1


System.out.println("Your circle's area is: " + area);
System.out.println("Your circle's area is: " + perimeter);

//area = PI * radius * radius
//perimeter = 2 * radius * PI

}
}
