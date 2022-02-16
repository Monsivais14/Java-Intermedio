//Calcular el costo de iva
package Basico;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String []args){

        double num;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el numero: ");
        num = in.nextInt();

        num*=0.16;
        System.out.print("El costo del iva es de: "+num);
    }
}