package Task_06;

public class Video extends File {
    public Video(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo vídeo \"" + this.name + ".mp4\" no VLC.");
    }
}