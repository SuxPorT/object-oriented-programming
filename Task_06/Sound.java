package Task_06;

public class Sound extends File {
    public Sound(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo áudio \"" + this.name + ".mp3\" no Spotify.");
    }
}