package Task_04;

public class Message {
    private String text;
    private boolean state;

    public Message(String text, boolean state) {
        this.text = text;
        this.state = state;
    }

    public void print() {
        System.out.println("    Texto: " + this.text);
        if (this.state) {
            System.out.println("    Status: Enviada\n");
        }
        else {
            System.out.println("    Status: Recebida\n");
        }
    }
}