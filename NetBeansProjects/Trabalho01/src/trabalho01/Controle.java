package trabalho01;

public class Controle {

    public static void main(String[] args) {
        
        // Programa principal
        Semaforo smfr = new Semaforo();
        
        System.out.println("Cor do semáforo: " + smfr.mostraCor());
        
        for (int i = 0; i < 10; i++) {
            smfr.mudaCorFixa(i);
            System.out.println("Mudando para a cor: " + smfr.mostraCor());
        }
        
        smfr.mudaCorFixa(1);
        
        System.out.println("Cor final: " + smfr.mostraCor());
        
    }
    
}
