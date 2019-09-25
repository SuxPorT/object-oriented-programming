package trabalho07;

public class Goldfinger extends Terrorista implements Personificacao {
    private Heroi heroi;
    
    public Goldfinger(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void saltar(float z) {
        System.out.println("Goldfinger saltando de " + this.posicao_z + " para " + z);
        this.posicao_z = z;
    }

    @Override
    public void camuflar(int cor) {
        System.out.println("Goldfinger camuflando com nova cor");
        this.cor = cor;
    }
    
    @Override
    public void personificar(Heroi h) {
        System.out.println("Goldfinger personificando " + h.getClass().getSimpleName());
        this.heroi = h;
        
    }
}
