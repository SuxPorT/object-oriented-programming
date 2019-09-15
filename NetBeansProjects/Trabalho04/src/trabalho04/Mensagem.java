package trabalho04;

public class Mensagem {
    // Atributos
    private String texto;
    private boolean estado;
    
    // Construtor
    public Mensagem(String texto, boolean estado) {
        this.texto = texto;
        this.estado = estado;
    }
    
    // Métodos
    public void imprimir() {
        System.out.println("    Texto: " + this.texto);
        if (this.estado) {
            System.out.println("    Status: Enviada\n");
        }
        else {
            System.out.println("    Status: Recebida\n");
        }
    }
}
