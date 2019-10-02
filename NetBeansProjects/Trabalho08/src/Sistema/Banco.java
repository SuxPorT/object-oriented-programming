package Sistema;

import java.util.ArrayList;

import Exceptions.ExcecaoContaInvalida;
import Exceptions.ExcecaoHorarioInvalido;
import Exceptions.ExcecaoSaldoInsuficiente;
import Exceptions.ExcecaoSenhaInvalida;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Banco {
    private String nome;
    private ArrayList<ContaCorrente> listaContas;
    
    public Banco(String nome) {
        this.nome = nome;
        listaContas = new ArrayList<>();
    }
    
    public void criar_conta(int numero, String senha, double saldo) {
        listaContas.add(new ContaCorrente(numero, senha, saldo));
        System.out.println("Conta " + numero + " criada com sucesso!");
    }
    
    public void sacar(int numero, String senha, double valor)
        throws ExcecaoContaInvalida, ExcecaoSenhaInvalida,
               ExcecaoHorarioInvalido, ExcecaoSaldoInsuficiente
    {
        int hora;
        Date data = new Date();
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.setTime(data); 
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        
        if (hora < 8 || hora > 22) {
            throw new ExcecaoHorarioInvalido("Horário inválido! Interrompendo o sistma.");
        }
        
        boolean flag = false;
        ContaCorrente usuario = null;
        
        for (ContaCorrente conta: listaContas) {
            if (conta.getNumero() == numero) {
                usuario = conta;
                flag = true;
                break;
            }
        }
        
        if (flag) {
            usuario.retirar(valor, senha);
        }
        else {
            throw new ExcecaoContaInvalida("Conta inválida! Interrompendo o sistma.");
        }
    }
}
