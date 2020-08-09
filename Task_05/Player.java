package Task_05;

public class Player {
    private String name;
    protected int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void print() {
        System.out.println("Nome: " + this.name);
        System.out.println("Score: " + this.score);
    }
}