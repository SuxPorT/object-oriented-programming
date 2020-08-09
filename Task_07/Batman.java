package Task_07;

public class Batman extends Hero implements Camouflage {
    public Batman(float x, float y, float z) {
        this.positionX = x;
        this.positionY = y;
        this.positionZ = z;
    }

    @Override
    public void shoot() {
        System.out.println("Batman atirando");
    }

    @Override
    public void camouflage(int color) {
        System.out.println("Batman camuflando com nova cor");
        this.color = color;
    }
}