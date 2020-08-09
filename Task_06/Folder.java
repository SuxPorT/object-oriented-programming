package Task_06;

import java.util.ArrayList;

public class Folder {
    public String name;
    ArrayList<File> fileCollection;

    public Folder(String name) {
        this.name = name;
        fileCollection = new ArrayList<>();
    }

    public void insert(File name) {
        fileCollection.add(name);
        System.out.println("Arquivo \"" + name.print() + "\" adicionado na pasta \"" + this.name +"\".");
    }

    public void remove(String name) {
        int position = 0;

        for (File file: fileCollection) {
            if (file.print().equals(name)) {
                position = fileCollection.indexOf(file);
            }
        }

        fileCollection.remove(position);
        System.out.println("\nArquivo \"" + name + "\" removido da pasta \"" + this.name +"\".");
    }

    public void list() {
        System.out.println("\nLista de arquivos dentro da pasta \"" + this.name + "\":");

        for (File file: fileCollection) {
            System.out.println(" - " + file.print());
        }

        System.out.println();
    }

    public void duplicate(String name) {
        int position = 0;

        for (File file: fileCollection) {
            if (file.print().equals(name)) {
                position = fileCollection.indexOf(file);
            }
        }

        fileCollection.add(fileCollection.get(position));
        System.out.println("\nArquivo \"" + name + "\" duplicado para a pasta \"" + this.name + "\".");
    }

    public String print() {
        return this.name;
    }
}