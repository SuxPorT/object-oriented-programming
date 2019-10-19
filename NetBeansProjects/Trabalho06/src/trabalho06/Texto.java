package trabalho06;

public class Texto extends Arquivo {

    public Texto(String nome) {
        super(nome);
    }
    
    public void abrir() {
        System.out.println("Abrindo texto \"" + this.nome + ".docx\" no Microsoft Word.");
    }
}
