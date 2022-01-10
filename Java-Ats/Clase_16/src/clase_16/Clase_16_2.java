
package clase_16;

import java.util.Scanner;

public class Clase_16_2 { //(a+b)cuadrado = a al cuadrado + b al cuadrado +
   
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Valor de a: ");
        float a = in.nextFloat();
        
        System.out.print("valor de b: ");
        float b = in.nextFloat();
        
        float calculo = (float)Math.pow(a, 2)+(float)Math.pow(b, 2)+(2*a*b);
        
        System.out.println("El resultado es: "+calculo);
    }
    
}
