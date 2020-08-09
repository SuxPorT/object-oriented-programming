package Task_06;

import java.util.ArrayList;

public class Disk {
    public char name;
    ArrayList<Folder> folderCollection;

    public Disk(char nome) {
        this.name = nome;
        folderCollection = new ArrayList<>();
    }

    public Folder makeFolder(String name) {
        Folder folder = new Folder(name);
        folderCollection.add(folder);
        System.out.println("Pasta \"" + name + "\" criada no disco \"" + this.name + "\".");

        return folder;
    }

    public void remove(String name) {
        int position = 0;

        for (Folder folder: folderCollection) {
            if (folder.print().equals(name)) {
                position = folderCollection.indexOf(folder);
            }
        }

        folderCollection.remove(folderCollection.get(position));
        System.out.println("Pasta \"" + name + "\" removida do disco \"" + this.name + "\".");
    }

    public void list() {
        System.out.println("\nLista de pastas dentro do disco \"" + this.name + "\":");

        for (Folder folder: folderCollection) {
            System.out.println(" - " + folder.print());
        }

        System.out.println();
    }
}