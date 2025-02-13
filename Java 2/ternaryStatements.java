/*
Ternary Statements -- Positive Negative
Khanon Curtis
2/4/25
*/
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a whole number: ");
int num = input.nextInt();

/*
String result;
if (num < 0) {
result = "Negative";
} else {
result = "Positive";
}
*/

String result = (num < 0) ? result = "Negative" : "Positive";
System.out.println(result);

}
}
