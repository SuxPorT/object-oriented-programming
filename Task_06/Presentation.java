package Task_06;

public class Presentation extends File {
    public Presentation(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo apresentação \"" + this.name + ".pptx\" no Microsoft PowerPoint.");
    }
}