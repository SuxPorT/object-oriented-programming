package Task_07;

abstract public class Thief extends Villain {
    @Override
    public void jump(float z) {
        System.out.println("Ladrão saltando de " + this.positionZ + " para " + z);
        this.positionZ = z;
    }
}