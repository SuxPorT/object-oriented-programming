package Task_02.Specialist;

import Task_02.Math.Rectangle;

public class CivilEngineer {
    private static String name = "Leonardo da Vinci";
    private static int age = 67;

    private static void exibir_dados_pessoais() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age + " anos");
    }

    public static void main(String[] args) {
        exibir_dados_pessoais();

        Rectangle.set_sides(4.7f, 8.2f);
        System.out.println("Área do retângulo: " + Rectangle.area());
        System.out.println("Perímetro do retângulo: " + Rectangle.perimeter());
    }
}