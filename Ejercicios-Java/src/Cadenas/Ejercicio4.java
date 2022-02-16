/*
pedir al usuario una cadena de caracteres, guardarla en un arreglo
y copiar su contenido en otro arreglo de caracteres
 */

package Cadenas;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String cadena1;
        String cadena2;

        System.out.print("Ingresa un dato: ");
        cadena1 = in.nextLine();
        cadena2 = cadena1;

        System.out.print("El ato que ingresaste es: "+cadena2);
    }
}
