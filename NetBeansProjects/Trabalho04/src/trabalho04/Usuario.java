package trabalho04;

import java.util.ArrayList;

public class Usuario {
    // Atributos
    private String nome;
    private ArrayList<Conversa> colecaoConversas;
    
    // Construtor
    public Usuario(String nome) {
        this.nome = nome;
        colecaoConversas  = new ArrayList<>();
    }
    
    // Métodos
    public void iniciarConversa(String contato) {
        colecaoConversas.add(new Conversa(this.nome));
        colecaoConversas.add(new Conversa(contato));
    }
    
    public void enviarMensagem(String destinatario, String texto) {
        for (Conversa usuario: colecaoConversas) {
            if (usuario.nome().toLowerCase().equals(destinatario.toLowerCase())) {
                usuario.mensagem(texto, true);
            }
        }
    }
    
    public void receberMensagem(String remetente, String texto) {
        for (Conversa usuario: colecaoConversas) {
            if (usuario.nome().toLowerCase().equals(remetente.toLowerCase())) {
                usuario.mensagem(texto, false);
            }
        }
    }
    
    public void imprimir(String contato) {
        for (Conversa usuario: colecaoConversas) {
            if (usuario.nome().toLowerCase() .equals(contato.toLowerCase()) && !contato.equals(this.nome)) {
                System.out.println(" - Contato: " + contato);
                usuario.imprimir();
            }
        }
    }
}
