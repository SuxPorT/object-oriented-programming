package trabalho07;

public class Batman extends Heroi implements Camuflagem {
    
    public Batman(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void atirar() {
        System.out.println("Batman atirando");
    }
    
    @Override
    public void camuflar(int cor) {
        System.out.println("Batman camuflando com nova cor");
        this.cor = cor;
    }
}
