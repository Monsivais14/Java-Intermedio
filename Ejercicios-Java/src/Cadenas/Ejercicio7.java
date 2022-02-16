/*
Agregar una cadena con el mensaje "hola que tal", y concatenarlo con el nombre d eusuario
 */
package Cadenas;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String cadena1="Hola que tal, ";
        String cadena2;

        System.out.print("Ingresa tu nombre: ");
        cadena2 = in.nextLine();

        System.out.print(cadena1 + cadena2);
    }
}