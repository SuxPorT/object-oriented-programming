package Task_07;

public class JamesBond extends Hero {
    public JamesBond(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void shoot() {
        System.out.println("James Bond atirando");
    }

    @Override
    public void jump(float z) {
        System.out.println("James Bond saltando de " + this.positionZ + " para " + z);
        this.positionZ = z;
    }
}