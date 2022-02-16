//Copiar el contenido de una cadena a otra
package Cadenas;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){

        String cadena1;
        String cadena2;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        cadena1 = in.nextLine();
        cadena2 = cadena1;
        System.out.print("tu nombre es: "+ cadena2);
    }
}
