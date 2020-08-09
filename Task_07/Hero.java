package Task_07;

abstract public class Hero extends Character {
    @Override
    public void run(float x, float y) {
        System.out.println("Herói correndo de (" + this.positionX + ", " + this.positionY + ") para (" + x + ", " + y + ")");
        this.positionX = x;
        this.positionY = y;
    }

    @Override
    public void jump(float z) {
        System.out.println("Herói saltando de " + this.positionZ + " para " + z);
        this.positionZ = z;
    }
}