package trabalho07;

abstract public class Personagem {
    private boolean vivo = true;
    protected float posicao_x;
    protected float posicao_y;
    protected float posicao_z;
    protected int cor;
    
    abstract public void correr(float x, float y);
    abstract public void saltar(float z);
    abstract public void atirar();
    
    public void morrer() {
        this.vivo = false;
        System.out.println(this.getClass().getSimpleName() + " morreu");
    }
    
}
