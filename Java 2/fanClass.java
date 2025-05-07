/******************************************************************************

fanClass
Khanon Curtis
5/6/25

*******************************************************************************/
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = Fan.FAST;
        fan1.on = true;
        fan1.radius = 10;
        fan1.color = "yellow";
        
        Fan fan2 = new Fan();
        fan2.speed = Fan.MEDIUM;
        fan2.on = false;
        fan2.radius = 5;
        fan2.color = "blue";

        System.out.println("Fan 1 Description -- " + fan1.getDescription());
        System.out.println("Fan 2 Description -- " + fan2.getDescription());
    }
}

class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";
    
    Fan() {
    }

    Fan(int newSpeed, boolean isOn, double newRadius, String newColor) {
        speed = newSpeed;
        on = isOn;
        radius = newRadius;
        color = newColor;
    }

    String getDescription() {
        if (on) {
            return String.format("Speed: %d  Color: %s   Radius: %.1f", 
                               speed, color, radius);
        } else {
            return String.format("Color: %s   Radius: %.1f   fan is off", 
                               color, radius);
        }
    }
}
