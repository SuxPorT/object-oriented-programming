package Task_07;

public class Pinguim extends Thief {
    public Pinguim(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void shoot() {
        System.out.println("Pinguim atirando");
    }

    @Override
    public void run(float x, float y) {
        System.out.println("Pinguim correndo de (" + this.positionX + ", " + this.positionY + ") para (" + x + ", " + y + ")");
        this.positionX = x;
        this.positionY = y;
    }
}