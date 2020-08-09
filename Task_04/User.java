package Task_04;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Conversation> conversationCollection;

    public User(String name) {
        this.name = name;
        conversationCollection = new ArrayList<>();
    }

    public void startConversation(String contact) {
        conversationCollection.add(new Conversation(this.name));
        conversationCollection.add(new Conversation(contact));
    }

    public void sendMessage(String receiver, String text) {
        for (Conversation user: conversationCollection) {
            if (user.name().toLowerCase().equals(receiver.toLowerCase())) {
                user.message(text, true);
            }
        }
    }

    public void receiveMessage(String sender, String text) {
        for (Conversation user: conversationCollection) {
            if (user.name().toLowerCase().equals(sender.toLowerCase())) {
                user.message(text, false);
            }
        }
    }

    public void print(String contact) {
        for (Conversation user: conversationCollection) {
            if (user.name().toLowerCase().equals(contact.toLowerCase()) && !contact.equals(this.name)) {
                System.out.println(" - Contato: " + contact);
                user.print();
            }
        }
    }
}