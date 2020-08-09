package Task_08.System;

import Task_08.Exceptions.ExceptionInsufficientFunds;
import Task_08.Exceptions.ExceptionInvalidPassword;

public class CurrentAccount {
    private int number;
    private String password;
    private double balance;

    public CurrentAccount(int number, String password, double balance) {
        this.number = number;
        this.password = password;
        this.balance = balance;
    }

    public void withdraw(double value, String password)
            throws ExceptionInvalidPassword, ExceptionInsufficientFunds
    {
        if (!password.equals(this.password)) {
            throw new ExceptionInvalidPassword("Senha inválida! Interrompendo o sistema.");
        }

        if (value > this.balance) {
            throw new ExceptionInsufficientFunds("Valor inválido! Interrompendo o sistema.");
        }

        System.out.println("\nConta: " + this.number);
        System.out.println("Saldo: R$" + this.balance);
        System.out.println("Saque: R$" + value);

        this.balance -= value;
        System.out.println("Saldo final: R$" + this.balance);
    }

    public int getNumber() {
        return this.number;
    }

    public String getPassword() {
        return this.password;
    }

    public double getBalance() {
        return this.balance;
    }
}