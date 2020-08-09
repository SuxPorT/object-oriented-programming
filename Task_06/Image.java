package Task_06;

public class Image extends File {
    public Image(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo imagem \"" + this.name + ".png\" na Galeria de Fotos.");
    }
}