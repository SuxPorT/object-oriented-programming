package Task_07;

public class DrNo extends Terrorist {
    public DrNo(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void jump(float z) {
        System.out.println("DrNo saltando de " + this.positionZ + " para " + z);
    }

    @Override
    public void shoot() {
        System.out.println("DrNo atirando");
    }

    @Override
    public void run(float x, float y) {
        System.out.println("DrNo correndo de (" + this.positionX + ", " + this.positionY + ") para (" + x + ", " + y + ")");
    }
}