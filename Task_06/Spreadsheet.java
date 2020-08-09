package Task_06;

public class Spreadsheet extends File {
    public Spreadsheet(String name) {
        super(name);
    }

    @Override
    public void open() {
        System.out.println("Abrindo planilha \"" + this.name + ".xlsx\" no Microsoft Excel.");
    }
}