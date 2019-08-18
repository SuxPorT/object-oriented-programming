package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {
    // Atributos
    private static String nome = "Leonardo da Vinci";
    private static int idade = 67;
    
    // Métodos
    private static void exibir_dados_pessoais() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");  
    }
    
    // Programa principal
    public static void main(String[] args) {
        exibir_dados_pessoais();
        Retangulo.definir_lados(4.7f, 8.2f);
        System.out.println("Área do retângulo: " + Retangulo.area());
        System.out.println("Perímetro do retângulo: " + Retangulo.perimetro());
    }
}
