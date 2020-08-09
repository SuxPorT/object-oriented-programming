package Task_07;

public class Goldfinger extends Terrorist implements Personification {
    private Hero hero;

    public Goldfinger(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void jump(float z) {
        System.out.println("Goldfinger saltando de " + this.positionZ + " para " + z);
        this.positionZ = z;
    }

    @Override
    public void camouflage(int color) {
        System.out.println("Goldfinger camuflando com nova cor");
        this.color = color;
    }

    @Override
    public void personification(Hero hero) {
        System.out.println("Goldfinger personificando " + hero.getClass().getSimpleName());
        this.hero = hero;
    }
}