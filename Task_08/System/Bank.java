package Task_08.System;

import Task_08.Exceptions.ExceptionInsufficientFunds;
import Task_08.Exceptions.ExceptionInvalidAccount;
import Task_08.Exceptions.ExceptionInvalidPassword;
import Task_08.Exceptions.ExceptionInvalidTime;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Bank {
    private String name;
    private ArrayList<CurrentAccount> accountCollection;

    public Bank(String name) {
        this.name = name;
        accountCollection = new ArrayList<>();
    }

    public void makeAccount(int number, String password, double balance) {
        accountCollection.add(new CurrentAccount(number, password, balance));
        System.out.println("Conta " + number + " criada com sucesso!");
    }

    public void withdraw (int number, String password, double value)
            throws ExceptionInvalidAccount, ExceptionInvalidPassword,
            ExceptionInvalidTime, ExceptionInsufficientFunds
    {
        int hour;
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        hour = calendar.get(Calendar.HOUR_OF_DAY);

        if (hour < 8 || hour > 22) {
            throw new ExceptionInvalidTime("Horário inválido! Interrompendo o sistema.");
        }

        boolean flag = false;
        CurrentAccount user = null;

        for (CurrentAccount account: accountCollection) {
            if (account.getNumber() == number) {
                user = account;
                flag = true;
                break;
            }
        }

        if (flag) {
            user.withdraw(value, password);
        }
        else {
            throw new ExceptionInvalidAccount("Conta inválida! Interrompendo o sistema.");
        }
    }
}