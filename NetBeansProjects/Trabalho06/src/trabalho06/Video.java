package trabalho06;

public class Video extends Arquivo {

    public Video(String nome) {
        super(nome);
    }
    
    public void abrir() {
        System.out.println("Abrindo vídeo \"" + this.nome + ".mp4\" no VLC");
    }
}
