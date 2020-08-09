package Task_07;

abstract public class Character {
    private boolean live = true;
    protected float positionX, positionY, positionZ;
    protected int color;

    abstract public void run(float x, float y);
    abstract public void jump(float z);
    abstract public void shoot();

    public void die() {
        this.live = false;
        System.out.println(this.getClass().getSimpleName() + " morreu");
    }
}