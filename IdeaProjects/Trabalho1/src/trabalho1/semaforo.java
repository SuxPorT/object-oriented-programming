package trabalho1;

public class semaforo {
    static int corSemaforo = 2;

    static void MudaProximaCor(){
        if(corSemaforo == 0){
            corSemaforo = 1;
        } else if(corSemaforo == 1){
            corSemaforo = 2;
        } else {
            corSemaforo = 0;
        }
    }

    static void MudaCorFixa(int corFixa){
        corSemaforo = corFixa;
    }

    static int MostraCor(){
        return corSemaforo;
    }
}

