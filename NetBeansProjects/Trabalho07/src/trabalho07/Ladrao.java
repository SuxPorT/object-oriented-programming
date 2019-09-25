package trabalho07;

abstract public class Ladrao extends Vilao {
    @Override
    public void saltar(float z) {
        System.out.println("Ladrão saltando de " + this.posicao_z + " para " + z);
        this.posicao_z = z;
    }
}
