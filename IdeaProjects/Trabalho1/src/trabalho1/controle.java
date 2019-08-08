package trabalho1;

public class controle {
    public static void main(String[] args){
        semaforo SMFR = new semaforo();
        int contador = 0;

        System.out.println("Cor atual: " + SMFR.corSemaforo);

        while(contador < 10){
            SMFR.MudaProximaCor();
            System.out.println("Mudando para a cor: " + SMFR.corSemaforo);
            contador++;
        }
        semaforo.MudaCorFixa(1);
        System.out.println("Cor final: " + SMFR.corSemaforo);
    }
}
