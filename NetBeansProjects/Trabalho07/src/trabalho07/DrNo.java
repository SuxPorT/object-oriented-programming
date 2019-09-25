package trabalho07;

public class DrNo extends Terrorista {
    
    public DrNo(float x, float y, float z) {
        this.posicao_x = x;
        this.posicao_y = y;
        this.posicao_z = z;
    }
    
    @Override
    public void saltar(float z) {
        System.out.println("DrNo saltando de " + this.posicao_z + " para " + z);
    }
    
    @Override
    public void atirar() {
        System.out.println("DrNo atirando");
    }
    
    @Override
    public void correr(float x, float y) {
        System.out.println("DrNo correndo de (" + this.posicao_x + ", " + this.posicao_y + ") para (" + x + ", " + y + ")");
    }
}
