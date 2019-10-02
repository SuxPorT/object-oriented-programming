package Sistema;

import Exceptions.ExcecaoContaInvalida;
import Exceptions.ExcecaoHorarioInvalido;
import Exceptions.ExcecaoSaldoInsuficiente;
import Exceptions.ExcecaoSenhaInvalida;

public class Teste {
    public static void main(String[] args) {
        
        Banco bradesco = new Banco("Bradesco");
        
        bradesco.criar_conta(1234, "abcd", 2000);
        bradesco.criar_conta(1111, "qwer", 1500);
        bradesco.criar_conta(1010, "test", 1000);
        bradesco.criar_conta(2019, "2019", 5500);
        bradesco.criar_conta(007, "bond", 1999);
        
        try {

            bradesco.sacar(1234, "abcd", 1900);
            bradesco.sacar(1111, "qwer", 1000);
            bradesco.sacar(1111, "qwer", 200);
            bradesco.sacar(1010, "test", 100);
            bradesco.sacar(2019, "2019", 2000);
            bradesco.sacar(007, "bond", 999);
            bradesco.sacar(1234, "abcd", 100);
            
            bradesco.sacar(999, "qwer", 100);    // Numero = 1111    ExcecaoContaInvalida
            bradesco.sacar(1234, "abcd", 100);    // Saldo = 0       ExcecaoSaldoInsuficiente
            bradesco.sacar(007, "james", 500);    // Senha = bond    ExcecaoSenhaInvalida
            // ExcecaoHorarioInvalido com a variável da classe Banco hora < 8 ou hora > 22
        }
        catch (ExcecaoContaInvalida | ExcecaoHorarioInvalido | ExcecaoSaldoInsuficiente | ExcecaoSenhaInvalida e){
            e.printStackTrace();
        }
        
    }
}
