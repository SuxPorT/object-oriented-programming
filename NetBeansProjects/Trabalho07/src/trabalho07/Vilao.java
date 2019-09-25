package trabalho07;

abstract public class Vilao extends Personagem {
    @Override
    public void correr(float x, float y) {
        System.out.println("Vilão correndo de (" + this.posicao_x + ", " + this.posicao_y + ") para (" + x + ", " + y + ")");
        this.posicao_x = x;
        this.posicao_y = y;
    }
}
