
package clase_13;

public class Clase_13 { // Clase Math
    
    public static void main(String[] args) {
        
        double raiz = Math.sqrt(21); //sqrt es para Raiz cuadrada de clase Math y retorna un double
        
        double base = 4, exponente = 2; //exponentes
        double resultado_pow = Math.pow(base, exponente);
        
        double numero = 4.56;
        double resultado_round = Math.round(numero);
        
        double resultado_random = Math.random();
        
        System.out.println(raiz);
        System.out.println(resultado_pow);
        System.out.println(resultado_round);
        System.out.println(resultado_random);
    }
    
}
