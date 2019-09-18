package trabalho06;

import java.util.ArrayList;

public class Pasta {
    public String nome;
    ArrayList<Arquivo> colecaoArquivos;
    
    public Pasta(String nome) {
        this.nome = nome;
        colecaoArquivos = new ArrayList<>();
    }
    
    public void inserir(Arquivo nome) {
        colecaoArquivos.add(nome);
        System.out.println("Arquivo \"" + nome.imprimir() + "\" adicionado na pasta \"" + this.nome +"\".");
    }
    
    public void remover(String nome) {
        int posicao = 0;
        for (Arquivo arquivo: colecaoArquivos) {
            if (arquivo.imprimir().equals(nome)) {
                posicao = colecaoArquivos.indexOf(arquivo);
            }
        }
        colecaoArquivos.remove(posicao);
        System.out.println("\nArquivo \"" + nome + "\" removido da pasta \"" + this.nome +"\".");
    }
    
    public void listar() {
        System.out.println("\nLista de arquivos dentro da pasta \"" + this.nome + "\":");
        for (Arquivo arquivo: colecaoArquivos) {
            System.out.println(" - " + arquivo.imprimir());
        }
        System.out.println();
    }
    
    public void duplicar(String nome) {
        int posicao = 0;
        for (Arquivo arquivo: colecaoArquivos) {
            if (arquivo.imprimir().equals(nome)) {
                posicao = colecaoArquivos.indexOf(arquivo); 
            }
        }
        colecaoArquivos.add(colecaoArquivos.get(posicao));
        System.out.println("\nArquivo \"" + nome + "\" duplicado para a pasta \"" + this.nome + "\".");
    }
    
    public String imprimir() {
        return this.nome;
    }
    
}
