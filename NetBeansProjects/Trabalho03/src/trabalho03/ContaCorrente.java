package trabalho03;

public class ContaCorrente {
    // Atributos
    private int numero;
    private double saldo;
    
    // Construtor
    public ContaCorrente(int numero, double saldo) {
        assert (saldo >=0): "Erro. Saldo não pode ser negativo";
        this.numero = numero;
        this.saldo = saldo;
    }
    
    // Métodos
    public void depositar(double deposito) {
        this.saldo += deposito;
    }
    
    public void retirar(double saque) {
        assert (this.saldo >= saque): "Erro. Saldo não pode ser negativo";
        this.saldo -= saque;
    }
    
    public void imprimir() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo da conta: R$" + this.saldo + "\n");
    }
}
