package Task_03;

public class CurrentAccount {
    private int number;
    private double balance;

    public CurrentAccount(int number, double balance) {
        assert (balance >=0): "Erro. Saldo não pode ser negativo";
        this.number = number;
        this.balance = balance;
    }

    public void toDeposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdrawal) {
        assert (this.balance >= withdrawal): "Erro. Saldo não pode ser negativo";
        this.balance -= withdrawal;
    }

    public void print() {
        System.out.println("Número da conta: " + this.number);
        System.out.println("Saldo da conta: R$" + this.balance + "\n");
    }
}