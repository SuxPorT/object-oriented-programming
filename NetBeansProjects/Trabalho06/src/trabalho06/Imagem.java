package trabalho06;

public class Imagem extends Arquivo {

    public Imagem(String nome) {
        super(nome);
    }
    
    @Override
    public void abrir() {
        System.out.println("Abrindo imagem \"" + this.nome + ".png\" na Galeria de Fotos.");
    }
}
