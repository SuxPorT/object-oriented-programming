package Exceptions;

public class ExcecaoContaInvalida extends ExcecaoAutenticacao {
    public ExcecaoContaInvalida(String mensagem) {
        super(mensagem);
    }
    
    public ExcecaoContaInvalida() {
        super();
    }
}
