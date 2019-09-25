package trabalho07;

public class JamesBond extends Heroi {
    
    public JamesBond(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void atirar() {
        System.out.println("James Bond atirando");
    }
    
    @Override
    public void saltar(float z) {
        System.out.println("James Bond saltando de " + this.posicao_z + " para " + z);
        this.posicao_z = z;
    }
}
