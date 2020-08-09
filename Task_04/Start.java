package Task_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        ArrayList<User> userCollection = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        User joao = new User("João");
        User maria = new User("Maria");
        userCollection.add(joao);
        userCollection.add(maria);
        names.add("João");
        names.add("Maria");

        // 1. Criar um novo usuário (e inseri-lo numa coleção de usuários)
        System.out.print("Nome de usuário: ");
        String username = scan.nextLine();

        User user = new User(username);
        userCollection.add(user);
        names.add(username);

        // 2. Mostrar todos os usuários criados
        System.out.println("Usuários criados:");
        for (String name: names) {
            System.out.println(" - " + name);
        }

        // 3. Iniciar uma conversa entre dois usuários
        System.out.println("\nIniciar conversa com:");
        for(int i = 0; i < names.size() - 1; i++) {
            System.out.println("[" + (i + 1) + "] " + names.get(i));
        }

        String receiver = "";
        boolean loop = true;

        while (loop) {
            System.out.print("Escolha: ");
            String number = scan.nextLine();

            switch (number) {
                case "1":
                    receiver = "João";
                    loop = false;
                    break;

                case "2":
                    receiver = "Maria";
                    loop = false;
                    break;

                default:
                    System.out.println("Erro. Escolha inválida.");
            }
        }

        user.startConversation(receiver);
        userCollection.get(names.indexOf(receiver)).startConversation(username);

        // 4. Mostrar a lista de usuários com os quais um usuário mantém conversas
        System.out.println("\nLista de contatos: ");
        for (String name: names) {
            user.print(name);
        }

        // 5. Enviar uma mensagem de um usuário para outro
        System.out.print("\nMensagem: ");
        String mensagem = scan.nextLine();

        user.sendMessage(receiver, mensagem);
        userCollection.get(names.indexOf(receiver)).receiveMessage(username, mensagem);

        userCollection.get(names.indexOf(receiver)).sendMessage(username, "Tudo bem?");
        user.receiveMessage(receiver, "Tudo bem?");

        // 6. Mostrar todas as mensagens de uma conversa de um usuário
        System.out.println("\nMensagens de " + names.get(names.indexOf(receiver)));
        userCollection.get(names.indexOf(receiver)).print(username);

        System.out.println("\nMensagens de " + names.get(names.indexOf(username)));
        userCollection.get(names.indexOf(username)).print(receiver);

        // 7. Encerrar o programa
    }
}