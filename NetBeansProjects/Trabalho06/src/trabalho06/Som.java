package trabalho06;

public class Som extends Arquivo {

    public Som(String nome) {
        super(nome);
    }
    
    @Override
    public void abrir() {
        System.out.println("Abrindo áudio \"" + this.nome + ".mp3\" no Spotify.");
    }
}
