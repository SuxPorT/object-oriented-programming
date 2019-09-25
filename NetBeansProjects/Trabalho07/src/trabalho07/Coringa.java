package trabalho07;

public class Coringa extends Ladrao {
    
    public Coringa(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void atirar() {
        System.out.println("Coringa atirando");
    }
}
