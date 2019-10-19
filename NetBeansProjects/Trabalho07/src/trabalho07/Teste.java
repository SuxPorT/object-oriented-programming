package trabalho07;

public class Teste {
    
    public static void main(String[] args) {
        Batman bruceWayne = new Batman(2, 5, 0);
        JamesBond jamesBond = new JamesBond(1, 1, 0);
        Coringa joker = new Coringa(0, 0, 2);
        Pinguim cobblepot = new Pinguim(1, 2, 3);
        Goldfinger goldfinger = new Goldfinger(2, 0, 2);
        DrNo juliusNo = new DrNo(2, 2, 0);
        
        System.out.println("================== Batman ==================");
        bruceWayne.atirar();
        bruceWayne.correr(2, 3);
        bruceWayne.saltar(1);
        bruceWayne.camuflar(2);
        
        System.out.println("\n================ James Bond =================");
        jamesBond.correr(2, 2);
        jamesBond.saltar(1);
        jamesBond.atirar();
        
        System.out.println("\n================== Coringa ===================");
        joker.atirar();
        joker.saltar(1);
        joker.correr(2, 3);
        joker.morrer();
        
        System.out.println("\n================== Pinguim ===================");
        cobblepot.atirar();
        cobblepot.correr(2, 2);
        cobblepot.saltar(0);
        
        System.out.println("\n================= Goldfinger =================");
        goldfinger.saltar(1);
        goldfinger.correr(2, 2);
        goldfinger.personificar(jamesBond);
        goldfinger.atirar();
        goldfinger.personificar(bruceWayne);
        
        System.out.println("\n==================== DrNo ====================");
        juliusNo.correr(1, 2);
        juliusNo.saltar(3);
        juliusNo.atirar();
        juliusNo.morrer();
    }
}
