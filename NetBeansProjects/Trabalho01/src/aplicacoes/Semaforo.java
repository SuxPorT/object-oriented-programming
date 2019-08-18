package aplicacoes;

public class Semaforo {
    // Atributos
    // Cor: 0 (verde), 1 (amarelo), 2 (vermelho)  
    static int cor = 2;
    
    // Métodos
    static void mudaProximaCor() {
        if (cor == 0) {
            cor = 1;
        } else if (cor == 1) {
            cor = 2;
        } else {
            cor = 0;
        }
    }
    
    static void mudaCorFixa(int numCor) {
        cor = numCor % 3;
    }
    
    static int mostraCor() {
        return cor;
    }
    
}