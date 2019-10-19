package Exceptions;

public class ExcecaoSeguranca extends Exception {
    
    public ExcecaoSeguranca (String mensagem) {
        super(mensagem);
    }
    
    public ExcecaoSeguranca() {
        super();
    }
}
