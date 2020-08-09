package Task_07;

public class Joker extends Thief {
    public Joker(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void shoot() {
        System.out.println("Coringa atirando");
    }
}