/*
Crear un pgrama que pida el nombre de usuario, luego verificar su longitud.
si la cadena supera los 10 caracteres, mostrarla en pantalla, de lo contrario no mostrarla.
 */
package Cadenas;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String cadena;
        int leng;

        System.out.println("Ingresa una cadena de caracteres: ");
        cadena = in.nextLine();
        leng = cadena.length();

        if(leng > 10){
            System.out.print(" EL tamaño de tu cadena es: "+leng);
        }
    }
}