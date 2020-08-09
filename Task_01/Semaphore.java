package Task_01;

public class Semaphore {
    static int color = 2;

    static void changeNextColor() {
        if (color == 0) {
            color = 1;
        } else if (color == 1) {
            color = 2;
        } else {
            color = 0;
        }
    }

    static void changeFixedColor(int colorNumber) {
        color = colorNumber % 3;
    }

    static int showColor() {
        return color;
    }
}