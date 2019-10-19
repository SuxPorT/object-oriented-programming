package trabalho07;

abstract public class Heroi extends Personagem {
    
    @Override
    public void correr(float x, float y) {
        System.out.println("Herói correndo de (" + this.posicao_x + ", " + this.posicao_y + ") para (" + x + ", " + y + ")");
        this.posicao_x = x;
        this.posicao_y = y;
    }
    
    @Override
    public void saltar(float z) {
        System.out.println("Herói saltando de " + this.posicao_z + " para " + z);
        this.posicao_z = z;
    }
}
