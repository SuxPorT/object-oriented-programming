package Sistema;

import Exceptions.ExcecaoSaldoInsuficiente;
import Exceptions.ExcecaoSenhaInvalida;

public class ContaCorrente {
    private int numero;
    private String senha;
    private double saldo;
    
    public ContaCorrente(int numero, String senha, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public void retirar(double valor, String senha)
        throws ExcecaoSenhaInvalida, ExcecaoSaldoInsuficiente
    {
        if (!senha.equals(this.senha)) {
            throw new ExcecaoSenhaInvalida("Senha inválida! Interrompendo o sistema.");
        }
        
        if (valor > this.saldo) {
            throw new ExcecaoSaldoInsuficiente("Valor inválido! Interrompendo o sistema.");
        }
        
        System.out.println("\nConta: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Saque: R$" + valor);
        
        this.saldo -= valor;
        System.out.println("Saldo final: R$" + this.saldo);
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
}
