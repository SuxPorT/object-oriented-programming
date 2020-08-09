package Task_01;

public class Control {

    public static void main(String[] args) {
        System.out.println("Cor do semáforo: " + Semaphore.showColor());

        for (int i = 0; i < 10; i++) {
            Semaphore.changeNextColor();
            System.out.println("Mudando para a cor: " + Semaphore.showColor());
        }

        Semaphore.changeFixedColor(1);
        System.out.println("Cor final: " + Semaphore.showColor());
    }
}