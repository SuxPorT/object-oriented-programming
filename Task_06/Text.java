package Task_06;

public class Text extends File {
    public Text(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo texto \"" + this.name + ".docx\" no Microsoft Word.");
    }
}