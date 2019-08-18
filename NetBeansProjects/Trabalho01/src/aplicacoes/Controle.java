/*
Grupo 3:
    Alexys Santiago P. S. F.
    Pedro Horchullhack
    Patrickerson dos Santos V.
    Julia Peyerl P.
*/

package aplicacoes;

public class Controle {

    public static void main(String[] args) {
        
        // Programa principal      
        System.out.println("Cor do semáforo: " + Semaforo.mostraCor());
        
        for (int i = 0; i < 10; i++) {
            Semaforo.mudaProximaCor();
            System.out.println("Mudando para a cor: " + Semaforo.mostraCor());
        }
        
        Semaforo.mudaCorFixa(1);
        System.out.println("Cor final: " + Semaforo.mostraCor());
        
    }
    
}