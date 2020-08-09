package Task_02.Math;

public class Circle {
    private static double PI = 3.141516;
    private static double radius;

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static double perimeter(double radius) {
        return 2 * PI * radius;
    }

    public static void set_radius(double radius) {
        Circle.radius = radius;
    }

    public static double area() {
        return PI * radius * radius;
    }

    public static double perimeter() {
        return 2 * PI * radius;
    }
}