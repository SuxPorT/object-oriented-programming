package trabalho01;

public class Semaforo {
    // Atributos
    // Cor: 0 (verde), 1 (amarelo), 2 (vermelho)  
    private int cor;
    
    // Construtor
    public Semaforo() {
        this.cor = 2;
    }

    // Getters e Setters
    private int getCor() {
        return cor;
    }

    private void setCor(int cor) {
        this.cor = cor;
    }
    
    // Métodos
    public void mudaProximaCor() {
        if (this.getCor() == 0) {
            this.setCor(1);
        } else if (this.getCor() == 1) {
            this.setCor(2);
        } else if (this.getCor() == 2) {
            this.setCor(0);
        }
    }
    
    public void mudaCorFixa(int numCor) {
        this.setCor(numCor % 3);
    }
    
    public int mostraCor() {
        return this.getCor();
    }
    
}
