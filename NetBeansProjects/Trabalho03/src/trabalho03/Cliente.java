package trabalho03;

public class Cliente {
    // Atributos
    private String nome;
    private ContaCorrente conta;
    
    // Construtor
    public Cliente(String nome) {
        this.nome = nome;
    }
    
    // Métodos
    public void ligar(ContaCorrente conta) {
        this.conta = conta;
    }
    
    public void depositar(double deposito) {
        this.conta.depositar(deposito);
    }
    
    public void retirar(double saque) {
        this.conta.retirar(saque);
    }
    
    public void imprimir() {
        System.out.println("Nome do cliente: " + this.nome);
        this.conta.imprimir();
    }
}
