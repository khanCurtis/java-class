/*
Population Estimator
Khanon Curtis
1/29/25
*/

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the current year: ");
final int currentYear = input.nextInt();

System.out.print("Enter the amount of years to estimate: ");
final int years = input.nextInt();

final int pop = 339996563;
//final int yearDay = 365 * years;

int secYear = 31536000;
int secBirth = 11;
int secDeath = 13;
int secIm = 45;

int est = (secYear / secBirth) - (secYear / secDeath) + (secYear / secIm);

System.out.printf("%n The current population is %,d %n", pop);
System.out.printf("The population in %d years will be: %,d", years, est * years + pop);

}
}
