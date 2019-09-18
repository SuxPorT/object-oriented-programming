package trabalho06;

import java.util.ArrayList;

public class Disco {
    public char nome;
    ArrayList<Pasta> colecaoPastas;
    
    public Disco(char nome) {
        this.nome = nome;
        colecaoPastas = new ArrayList<>();
    }
    
    public Pasta criar_pasta(String nome) {
        Pasta pasta = new Pasta(nome);
        colecaoPastas.add(pasta);
        System.out.println("Pasta \"" + nome + "\" criada no disco \"" + this.nome + "\".");
        return pasta;
    }
    
    public void remover(String nome) {
        int posicao = 0;
        for (Pasta pasta: colecaoPastas) {
            if (pasta.imprimir().equals(nome)) {
                posicao = colecaoPastas.indexOf(pasta);
                
            }
        }
        colecaoPastas.remove(colecaoPastas.get(posicao));
        System.out.println("Pasta \"" + nome + "\" removida do disco \"" + this.nome + "\".");
    }
    
    public void listar() {
        System.out.println("\nLista de pastas dentro do disco \"" + this.nome + "\":");
        for (Pasta pasta: colecaoPastas) {
            System.out.println(" - " + pasta.imprimir());
        }
        System.out.println();
    }
    
}
