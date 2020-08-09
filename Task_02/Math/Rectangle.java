package Task_02.Math;

public class Rectangle {
    private static float sideH, sideV;

    public static void set_sides(float horizontal, float vertical) {
        assert (horizontal >= 0): "Não admite-se lados negativos";
        assert (vertical >= 0): "Não admite-se lados negativos";
        sideH = horizontal;
        sideV = vertical;
    }

    public static float area() {
        return sideH * sideV;
    }

    public static float perimeter() {
        return 2 * (sideH + sideV);
    }
}