package Task_08.System;

import Task_08.Exceptions.ExceptionInsufficientFunds;
import Task_08.Exceptions.ExceptionInvalidAccount;
import Task_08.Exceptions.ExceptionInvalidPassword;
import Task_08.Exceptions.ExceptionInvalidTime;

public class Test {

    public static void main(String[] args) {
        Bank bradesco = new Bank("Bradesco");

        bradesco.makeAccount(1234, "abcd", 2000);
        bradesco.makeAccount(1111, "qwer", 1500);
        bradesco.makeAccount(1010, "test", 1000);
        bradesco.makeAccount(2019, "2019", 5500);
        bradesco.makeAccount(007, "bond", 1999);

        try {
            bradesco.withdraw(1234, "abcd", 1900);
            bradesco.withdraw(1111, "qwer", 1000);
            bradesco.withdraw(1111, "qwer", 200);
            bradesco.withdraw(1010, "test", 100);
            bradesco.withdraw(2019, "2019", 2000);
            bradesco.withdraw(007, "bond", 999);
            bradesco.withdraw(1234, "abcd", 100);

            bradesco.withdraw(999, "qwer", 100);     // Numero = 1111    ExceptionInvalidAccount
            bradesco.withdraw(1234, "abcd", 100);    // Saldo = 0        ExceptionInsufficientFunds
            bradesco.withdraw(007, "james", 500);    // Senha = bond     ExceptionInvalidPassword
            // ExceptionInvalidTime com a variável da classe Bank hour < 8 ou hour > 22
        }
        catch (ExceptionInvalidAccount | ExceptionInvalidTime | ExceptionInsufficientFunds | ExceptionInvalidPassword e){
            e.printStackTrace();
        }
    }
}