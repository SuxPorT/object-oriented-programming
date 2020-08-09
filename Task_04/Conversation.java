package Task_04;

import java.util.ArrayList;

public class Conversation {
    private String name;
    private ArrayList<Message> messageCollection;

    public Conversation(String name) {
        this.name = name;
        messageCollection = new ArrayList<>();
    }

    public void message(String text, boolean state) {
        messageCollection.add(new Message(text, state));
    }

    public void print() {
        for (Message message: messageCollection) {
            message.print();
        }
    }

    public String name() {
        return this.name;
    }
}