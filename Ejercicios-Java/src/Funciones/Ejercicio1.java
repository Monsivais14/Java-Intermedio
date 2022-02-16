/*
Escribir una funcion que acepte dos numero de punto flotante como parametro
y multiplique estos desplegando el resultado
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        float n1,n2;

        System.out.println("Inseta dos numeros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();

        multi(n1,n2);
    }
    private static void multi(float x, float y){
        float multi = x * y;
        System.out.print("El resultado es: "+multi);
    }
}