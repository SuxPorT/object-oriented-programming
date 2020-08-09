package Task_05;

public class Senior extends Professional {
    private double prize;

    public Senior(String name, int score, double capital, double prize) {
        super(name, score, capital);
        this.prize = prize;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Prêmio: " + this.prize);
    }

    @Override
    public void win(int p) {
        super.win(p);
        this.prize *= 2;
    }

    @Override
    public void lose(int p) {
        super.lose(p);
        this.prize /= 2;
    }
}