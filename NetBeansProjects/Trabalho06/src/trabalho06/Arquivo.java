package trabalho06;

import java.util.Arrays;

public class Arquivo {
    public String nome;
    public byte[] sequenciaBytes;
    
    public Arquivo(String nome) {
        this.nome = nome;
        this.sequenciaBytes = this.nome.getBytes();
    }
    
    public void abrir() {
        System.out.println("Abrindo arquivo " + this.nome + " para edição de bytes.");
    }
    
    public Arquivo criarCopia(String nome) {
        Arquivo arquivo = new Arquivo(nome);
        System.out.println("Arquivo \"" + nome + "\" copiado com sucesso!");
        
        return arquivo;
    }
    
    public String imprimir() {
        return this.nome;
    }
    
    public void sequenciaBytes() {
        System.out.println("Sequência de bytes do arquivo " + this.nome + ":");
        System.out.println(Arrays.toString(this.sequenciaBytes) + "\n");
    }
}
