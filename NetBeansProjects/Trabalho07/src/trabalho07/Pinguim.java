package trabalho07;

public class Pinguim extends Ladrao {
    
    public Pinguim(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void atirar() {
        System.out.println("Pinguim atirando");
    }
    
    @Override
    public void correr(float x, float y) {
        System.out.println("Pinguim correndo de (" + this.posicao_x + ", " + this.posicao_y + ") para (" + x + ", " + y + ")");
        this.posicao_x = x;
        this.posicao_y = y;
    }
}
