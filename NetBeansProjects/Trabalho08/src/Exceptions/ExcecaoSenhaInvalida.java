package Exceptions;

public class ExcecaoSenhaInvalida extends ExcecaoAutenticacao {
    
    public ExcecaoSenhaInvalida(String mensagem) {
        super(mensagem);
    }
    
    public ExcecaoSenhaInvalida() {
        super();
    }
}
