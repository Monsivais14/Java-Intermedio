
package clase_14;

import java.util.Scanner;

//calcular la calificacion e imprima la suma de 3 calificaciones

public class Clase_14 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digita 3 calificaciones: ");
        nota1 = in.nextFloat();
        nota2 = in.nextFloat();
        nota3 = in.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("La suma es: "+suma);
    }
    
}
