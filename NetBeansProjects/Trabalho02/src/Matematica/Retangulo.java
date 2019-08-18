package Matematica;

public class Retangulo {
    // Atributos
    private static float ladoH, ladoV;
    
    // Métodos
    public static void definir_lados(float h, float v) {
        assert (h >= 0): "Não admite-se lados negativos";
        assert (v >= 0): "Não admite-se lados negativos";
        ladoH = h;
        ladoV = v;
        
    }
    
    public static float area() {
        return ladoH * ladoV;
    }
    
    public static float perimetro() {
        return 2 * (ladoH + ladoV);
    }
}
