/******************************************************************************

ShapesArea
Khanon Curtis
3/12/25

*******************************************************************************/
import java.util.Scanner;
public class Main {

    public static double area_circle(int radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public static double area_rectangle(int length, int width) {
        double area = length * width;
        return area;
    }

    public static double area_square(int side) {
        double area = Math.pow(side, 2);
        return area;
    }

    public static double area_triangle(int base, int height) {
        double area = 0.5 * base * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Time to calculate some area.");
        System.out.println("1. Triangle \n2. Rectangle \n3. Square \n4. Circle \n5. Exit");

        System.out.print("Select a shape: ");
        int user = input.nextInt();

        String choice;
        double area;

        switch (user) {
            case 1:
                System.out.print("Enter base: ");
                int base = input.nextInt();
                System.out.print("Enter height: ");
                int height = input.nextInt();
                area = area_triangle(base, height);
                choice = "Triangle";
                break;
            case 2:
                System.out.print("Enter length: ");
                int length = input.nextInt();
                System.out.print("Enter width: ");
                int width = input.nextInt();
                area = area_rectangle(length, width);
                choice = "Rectangle";
                break;
            case 3:
                System.out.print("Enter side: ");
                int side = input.nextInt();
                area = area_square(side);
                choice = "Square";
                break;
            case 4:
                System.out.print("Enter radius: ");
                int radius = input.nextInt();
                area = area_circle(radius);
                choice = "Circle";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.printf("The area of the %s is %.2f%n", choice, area);
    }
}
