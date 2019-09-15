package trabalho05;

public class Senior extends Profissional {
    private double premio;

    public Senior(String nome, int score, double capital, double premio) {
        super(nome, score, capital);
        this.premio = premio;
    }
    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prêmio: " + this.premio);
    }
    
    @Override
    public void ganhar(int p) {
        super.ganhar(p);
        this.premio *= 2;
    }
    
    @Override
    public void perder(int p) {
        super.perder(p);
        this.premio /= 2;
    }
}
