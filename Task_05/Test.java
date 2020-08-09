package Task_05;

public class Test {

    public static void main(String[] args) {

        System.out.println("--- PRINCIPIANTE ---");
        Beginner joao = new Beginner("João", 200, 900);
        joao.win(250);
        joao.lose(120);
        joao.print();

        System.out.println("\n--- PROFISSIONAL ---");
        Professional pedro = new Professional("Pedro", 320, 1800);
        pedro.win(400);
        pedro.lose(220);
        pedro.print();

        System.out.println("\n------ SENIOR ------");
        Senior tiago = new Senior("Tiago", 450, 2100, 1500);
        tiago.win(850);
        tiago.lose(780);
        tiago.print();
    }
}