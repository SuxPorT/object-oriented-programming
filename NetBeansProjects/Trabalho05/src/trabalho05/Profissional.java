package trabalho05;

public class Profissional extends Jogador {
    private double capital;

    public Profissional(String nome, int score, double capital) {
        super(nome, score);
        this.capital = capital;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Capital: " + this.capital);
    }
    
    public void ganhar(int p) {
        this.score += p;
        this.capital += p * 4;
    }
    
    public void perder(int p) {
        this.score -= p;
        this.capital -= p * 4;
    }
}
