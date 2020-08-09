package Task_03;

public class Bank {

    public static void main(String[] args) {

        Client jandira = new Client("Jandira Silva");
        Client sandra = new Client("Sandra Rodrigues");
        Client luciana = new Client("Luciana Teixeira");

        CurrentAccount client01 = new CurrentAccount(84037, 2500.00);
        CurrentAccount client02 = new CurrentAccount(70662, 1800.00);
        CurrentAccount client03 = new CurrentAccount(20718, 5000.00);

        jandira.turnOn(client01);
        sandra.turnOn(client02);
        luciana.turnOn(client03);

        // Jandira Silva, conta número 84037, saldo R$2500.00
        jandira.print();

        // Sandra Rodrigues, conta número 70662, saldo R$1800.00
        sandra.print();

        // Luciana Teixeira, conta número 20718, saldo R$5000.00
        luciana.print();

        client01.withdraw(1000);
        jandira.print();

        client02.withdraw(2000);
        client02.toDeposit(500);
        sandra.print();

        client02.withdraw(2000);
        sandra.print();

        client03.toDeposit(1000);
        luciana.print();
    }
}