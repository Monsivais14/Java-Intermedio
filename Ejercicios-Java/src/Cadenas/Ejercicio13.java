/*
 Pedir el nombre al usuario en mayuscula, si su nombre comienza en A convertir su nombre a minusculas
 caso contrario dejalo sin convertirlo
 */
package Cadenas;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String []args){
        String nombre;
        Scanner in = new Scanner(System.in);

        System.out.print("Inglrese su nombre: ");
        nombre = in.nextLine();

        if(nombre.charAt(0) =='A'){
            System.out.print("Bienvenido " + nombre.toLowerCase());
        }else{
            System.out.print("Bienvenido " + nombre);
        }
    }
}
