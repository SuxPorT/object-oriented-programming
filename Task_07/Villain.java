package Task_07;

abstract public class Villain extends Character {
    @Override
    public void run(float x, float y) {
        System.out.println("Vilão correndo de (" + this.positionX + ", " + this.positionY + ") para (" + x + ", " + y + ")");
        this.positionX = x;
        this.positionY = y;
    }
}