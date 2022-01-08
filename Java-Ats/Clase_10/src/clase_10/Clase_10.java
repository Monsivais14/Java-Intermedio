
package clase_10;

import java.util.Scanner;

public class Clase_10 { //operadores aritmeticos
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digita el primer numero:");
        float numero1 = in.nextFloat();
        
        System.out.println("Digita el segundo numero:");
        float numero2 = in.nextFloat();
        
        float suma = numero1+numero2; //operador aritmetico + para sumar
        float resta = numero1-numero2; // menos -
        float multi = numero1*numero2; // multiplica
        float div = numero1/numero2;
        float resto = numero1%numero2; //muestra el residuo de una division
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion: "+multi);
        System.out.println("La division en: "+div);
        System.out.println("El resto: "+resto);
        
    }
    
}
