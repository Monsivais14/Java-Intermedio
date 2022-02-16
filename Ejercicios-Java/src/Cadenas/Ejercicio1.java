//Obtener la longitud de una cadea de caracteres con la funcion length()

package Cadenas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int len=0;
        String cadena;
        System.out.print("Escribe una cadena de caracteres :");
        cadena = in.nextLine().trim();
        len = cadena.length();

        System.out.print("El tamaño de la cadena es "+ len);
    }
}