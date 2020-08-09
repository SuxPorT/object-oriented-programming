package Task_03;

public class Client {
    private String name;
    private CurrentAccount account;

    public Client(String name) {
        this.name = name;
    }

    public void turnOn(CurrentAccount account) {
        this.account = account;
    }

    public void toDeposit(double deposit) {
        this.account.toDeposit(deposit);
    }

    public void withdraw(double withdrawal) {
        this.account.withdraw(withdrawal);
    }

    public void print() {
        System.out.println("Nome do cliente: " + this.name);
        this.account.print();
    }
}