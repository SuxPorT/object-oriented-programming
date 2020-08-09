package Task_06;

import java.util.Arrays;

public class File {
    public String name;
    public byte[] bytesSequence;

    public File(String name) {
        this.name = name;
        this.bytesSequence = this.name.getBytes();
    }

    public void open() {
        System.out.println("Abrindo arquivo " + this.name + " para edição de bytes.");
    }

    public File makeCopy(String name) {
        File file = new File(name);
        System.out.println("Arquivo \"" + name + "\" copiado com sucesso!");

        return file;
    }

    public String print() {
        return this.name;
    }

    public void bytesSequence() {
        System.out.println("Sequência de bytes do arquivo " + this.name + ":");
        System.out.println(Arrays.toString(this.bytesSequence) + "\n");
    }
}