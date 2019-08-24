package trabalho03;

public class Banco {
    // Método principal
    public static void main(String[] args) {
        
        Cliente jandira = new Cliente("Jandira Silva");
        Cliente sandra = new Cliente("Sandra Rodrigues");
        Cliente luciana = new Cliente("Luciana Teixeira");
        
        ContaCorrente cc1 = new ContaCorrente(84037, 2500.00);
        ContaCorrente cc2 = new ContaCorrente(70662, 1800.00);
        ContaCorrente cc3 = new ContaCorrente(20718, 5000.00);
        
        jandira.ligar(cc1);
        sandra.ligar(cc2);
        luciana.ligar(cc3);
        
        // Jandira Silva, conta número 84037, saldo R$2500.00
        jandira.imprimir();
        
        // Sandra Rodrigues, conta número 70662, saldo R$1800.00
        sandra.imprimir();
        
        // Luciana Teixeira, conta número 20718, saldo R$5000.00
        luciana.imprimir();
        
        cc1.retirar(1000);
        jandira.imprimir();
        
        cc2.retirar(2000);
        cc2.depositar(500);
        sandra.imprimir();
        
        cc2.retirar(2000);
        sandra.imprimir();
        
        cc3.depositar(1000);
        luciana.imprimir();
    }
}
