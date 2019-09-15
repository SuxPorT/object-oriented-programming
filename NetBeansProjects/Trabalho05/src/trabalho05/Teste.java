package trabalho05;

public class Teste {
    
    public static void main(String[] args) {
        
        System.out.println(" --- PRINCIPIANTE ---");
        Principiante joao = new Principiante("João", 200, 900);
        joao.ganhar(250);
        joao.perder(120);
        joao.imprimir();
        System.out.println();
        
        System.out.println(" --- PROFISSIONAL ---");
        Profissional pedro = new Profissional("Pedro", 320, 1800);
        pedro.ganhar(400);
        pedro.perder(220);
        pedro.imprimir();
        System.out.println();
        
        System.out.println(" ------ SENIOR ------");
        Senior tiago = new Senior("Tiago", 450, 2100, 1500);
        tiago.ganhar(850);
        tiago.perder(780);
        tiago.imprimir();
    }
}
