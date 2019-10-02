package Exceptions;

public class ExcecaoSaldoInsuficiente extends Exception {
    public ExcecaoSaldoInsuficiente(String mensagem) {
        super(mensagem);
    }
    
    public ExcecaoSaldoInsuficiente() {
        super();
    }
}
