package trabalho06;

public class Apresentacao extends Arquivo {

    public Apresentacao(String nome) {
        super(nome);
    }
    
    public void abrir() {
        System.out.println("Abrindo apresentação \"" + this.nome + ".pptx\" no Microsoft PowerPoint.");
    }
}
