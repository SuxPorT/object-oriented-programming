package trabalho06;

public class Planilha extends Arquivo {

    public Planilha(String nome) {
        super(nome);
    }
    
    @Override
    public void abrir() {
        System.out.println("Abrindo planilha \"" + this.nome + ".xlsx\" no Microsoft Excel.");
    }
}
