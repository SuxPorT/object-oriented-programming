package Especialista;

import Matematica.Retangulo;

public class EngenheiroCivil {
    private static String nome = "Leonardo da Vinci";
    private static int idade = 67;
    
    private static void exibir_dados_pessoais() {
        System.out.println(nome);
        System.out.println(idade + " anos");  
    }
    
    public static void main(String[] args) {
        exibir_dados_pessoais();
        Retangulo.definir_lados(4.7f, 8.2f);
        System.out.println("Área: " + Retangulo.area());
        System.out.println("Perímetro: " + Retangulo.perimetro());
    }
}
