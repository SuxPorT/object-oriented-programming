package Task_05;

public class Professional extends Player {
    private double capital;

    public Professional(String name, int score, double capital) {
        super(name, score);
        this.capital = capital;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Capital: " + this.capital);
    }

    public void win(int p) {
        this.score += p;
        this.capital += p * 4;
    }

    public void lose(int p) {
        this.score -= p;
        this.capital -= p * 4;
    }
}