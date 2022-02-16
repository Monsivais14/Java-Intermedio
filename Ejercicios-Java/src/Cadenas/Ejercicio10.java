/*
Convertir a mayuscula una cadena
 */
package Cadenas;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String palabra;

        System.out.print("Inglesa una palabra: ");
        palabra = in.next();

        System.out.print(palabra.toUpperCase());
    }
}
