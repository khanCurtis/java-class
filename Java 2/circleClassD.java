/******************************************************************************

circleClassD
Khanon Curtis
4/23/25

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
		circle circle1 = new circle();
		System.out.printf("Circle 1 with a radius of %.2f:\n\tArea: %.2f\n\tPerimeter: %.2f\n\n", circle1.radius, circle1.getArea(), circle1.getPerimeter());
		
		circle circle2 = new circle(25);
		System.out.printf("Circle 2 with a radius of %.2f:\n\tArea: %.2f\n\tPerimeter: %.2f\n\n", circle2.radius, circle2.getArea(), circle2.getPerimeter());

		circle circle3 = new circle(125);
		System.out.printf("Circle 3 with a radius of %.2f:\n\tArea: %.2f\n\tPerimeter: %.2f", circle3.radius, circle3.getArea(), circle3.getPerimeter());
		
	}
}

class circle {
    double radius;
    
    circle() {
        radius = 1;
    }
    
    circle (double newRadius) {
        radius = newRadius;
    }
    
    double getArea() {
        return Math.PI * radius * radius;
    }
    
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    void setRadius(double newRadius) {
        radius = newRadius;
    }
    
}
