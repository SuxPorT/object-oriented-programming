package trabalho05;

public class Principiante extends Jogador {
    private double bonus;

    public Principiante(String nome, int score, double bonus) {
        super(nome, score);
        this.bonus = bonus;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Bônus: " + this.bonus);
    }
    
    public void ganhar(int p) {
        this.score += p;
        this.bonus += 0.1 * p;
    }
    
    public void perder(int p) {
        this.score -= p;
        this.bonus -= 0.1 * p;
    }
}
