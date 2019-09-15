package trabalho04;

import java.util.ArrayList;

public class Conversa {
    // Atributos
    private String nome;
    private ArrayList<Mensagem> colecaoMensagens;
    
    // Construtor
    public Conversa(String nome) {
        this.nome = nome;
        colecaoMensagens = new ArrayList<>();
    }
    
    // Métodos    
    public void mensagem(String texto, boolean estado) {
        colecaoMensagens.add(new Mensagem(texto, estado));
    }

    public void imprimir() {
        for (Mensagem conversa: colecaoMensagens) {
            conversa.imprimir();
        }
    }
    
    public String nome() {
        return this.nome;
    }
}
