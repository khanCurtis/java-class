/******************************************************************************

rectClass
5/6/25
Khanon Curtis

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("Rectangle 1");
        System.out.printf("height: %.2f\n", rectangle1.height);
        System.out.printf("Width: %.2f\n", rectangle1.width);
        System.out.printf("Area: %.2f\n", rectangle1.getArea());
        System.out.printf("Perimeter: %.2f\n\n", rectangle1.getPerimeter());
        
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("Rectangle 2");
        System.out.printf("height: %.2f\n", rectangle2.height);
        System.out.printf("Width: %.2f\n", rectangle2.width);
        System.out.printf("Area: %.2f\n", rectangle2.getArea());
        System.out.printf("Perimeter: %.2f\n", rectangle2.getPerimeter());
    }
}

class Rectangle {
    double width;
    double height;
    
    Rectangle() {
        width = 1;
        height = 1;
    }
    
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
