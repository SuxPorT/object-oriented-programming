package Exceptions;

public class ExcecaoAutenticacao extends ExcecaoSeguranca {
    public ExcecaoAutenticacao(String mensagem) {
        super(mensagem);
    }
    
    public ExcecaoAutenticacao() {
        super();
    }
}
