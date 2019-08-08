package trabalho1;

public class controle {
    public static void main(String[] args){
        semaforo smfr = new semaforo();
        int contador = 0;

        System.out.println("Cor atual: " + smfr.corSemaforo);

        while(contador < 10){
            smfr.MudaProximaCor();
            System.out.println("Mudando para a cor: " + smfr.corSemaforo);
            contador++;
        }
        smfr.MudaCorFixa(1);
        System.out.println("Cor final: " + smfr.corSemaforo);
    }
}
