package Task_06;

public class SystemRoot {
    public static void main(String[] args) {
        Disk disk = new Disk('C');

        Folder schoolFolder = disk.makeFolder("Escola");
        Folder personalFolder = disk.makeFolder("Pessoal");

        disk.list();

        Text textFile = new Text("Trabalho 10");
        schoolFolder.insert(textFile);
        Presentation presentationFile = new Presentation("Defesa Projeto 2");
        schoolFolder.insert(presentationFile);
        Spreadsheet spreadsheetFile = new Spreadsheet("Calculo 2");
        schoolFolder.insert(spreadsheetFile);

        schoolFolder.list();

        Video videoFile = new Video("Aniversario");
        personalFolder.insert(videoFile);
        Image imageFile = new Image("Foto RJ");
        personalFolder.insert(imageFile);
        Sound soundFile = new Sound("Musica Chico");
        personalFolder.insert(soundFile);

        personalFolder.list();

        textFile.open();
        presentationFile.open();
        spreadsheetFile.open();
        videoFile.open();
        imageFile.open();
        soundFile.open();

        schoolFolder.remove("Trabalho 10");
        schoolFolder.duplicate("Defesa Projeto 2");
        schoolFolder.list();

        disk.remove("Pessoal");
        disk.list();
    }
}