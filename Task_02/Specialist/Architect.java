package Task_02.Specialist;

import Task_02.Math.Circle;

public class Architect {
    private static String name = "Oscar Niemeyer";
    private static int age = 104;

    private static void display_personal_data() {
        System.out.println(name);
        System.out.println(age + " anos");
    }

    public static void main(String[] args) {
        display_personal_data();

        System.out.println("Área do círculo de raio 5 = " + Circle.area(5));
        System.out.println("Perímetro do círculo de raio 5 = " + Circle.perimeter(5));
        System.out.println("Com raio = 10:");

        Circle.set_radius(10);
        System.out.println("Área = " + Circle.area());
        System.out.println("Perímetro = "+ Circle.perimeter());
    }
}