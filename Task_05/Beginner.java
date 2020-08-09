package Task_05;

public class Beginner extends Player {
    private double bonus;

    public Beginner(String name, int score, double bonus) {
        super(name, score);
        this.bonus = bonus;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Bônus: " + this.bonus);
    }

    public void win(int p) {
        this.score += p;
        this.bonus += 0.1 * p;
    }

    public void lose(int p) {
        this.score -= p;
        this.bonus -= 0.1 * p;
    }
}