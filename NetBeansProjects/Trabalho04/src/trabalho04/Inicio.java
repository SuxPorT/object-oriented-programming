package trabalho04;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        // Programa principal
        ArrayList<Usuario> colecaoUsuarios = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");
        colecaoUsuarios.add(joao);
        colecaoUsuarios.add(maria);
        nomes.add("João");
        nomes.add("Maria");


        // 1. Criar um novo usuário (e inseri-lo numa coleção de usuários)
        System.out.print("Nome de usuário: ");
        String nomeUsuario = scan.nextLine();

        Usuario pessoa = new Usuario(nomeUsuario);
        colecaoUsuarios.add(pessoa);
        nomes.add(nomeUsuario);


        // 2. Mostrar todos os usuários criados
        System.out.println("Usuários criados:");
            for (String nome: nomes) {
            System.out.println(" - " + nome);
        }


        // 3. Iniciar uma conversa entre dois usuários
        System.out.println("\nIniciar conversa com:");
        for(int i = 0; i < nomes.size() - 1; i++) {
            System.out.println("[" + (i + 1) + "] " + nomes.get(i));
        }

        String destinatario = "";
        boolean escolher = true;

        while (escolher) {
            System.out.print("Escolha: ");

            String numero = scan.nextLine();

            switch (numero) {
                case "1":
                    destinatario = "João";
                    escolher = false;
                    break;

                case "2":
                    destinatario = "Maria";
                    escolher = false;
                    break;

                default:
                    System.out.println("Erro. Escolha inválida.");
            }
        }

        pessoa.iniciarConversa(destinatario);
        colecaoUsuarios.get(nomes.indexOf(destinatario)).iniciarConversa(nomeUsuario);


        // 4. Mostrar a lista de usuários com os quais um usuário mantém conversas
        System.out.println("\nLista de contatos: ");
        for (String dest: nomes) {
            pessoa.imprimir(dest);
        }


        // 5. Enviar uma mensagem de um usuário para outro
        System.out.print("\nMensagem: ");
        String mensagem = scan.nextLine();

        pessoa.enviarMensagem(destinatario, mensagem);
        colecaoUsuarios.get(nomes.indexOf(destinatario)).receberMensagem(nomeUsuario, mensagem);

        colecaoUsuarios.get(nomes.indexOf(destinatario)).enviarMensagem(nomeUsuario, "Tudo bem?");
        pessoa.receberMensagem(destinatario, "Tudo bem?");


        // 6. Mostrar todas as mensagens de uma conversa de um usuário
        System.out.println("\nMensagens de " + nomes.get(nomes.indexOf(destinatario)));
        colecaoUsuarios.get(nomes.indexOf(destinatario)).imprimir(nomeUsuario);

        System.out.println("\nMensagens de " + nomes.get(nomes.indexOf(nomeUsuario)));
        colecaoUsuarios.get(nomes.indexOf(nomeUsuario)).imprimir(destinatario);


        // 7. Encerrar o programa
    }
}
