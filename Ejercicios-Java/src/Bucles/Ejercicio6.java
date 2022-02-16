/*
Hacer un programa que calcule la suma de n numeros dados por la consola
*/
package Bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){

        int n, suma=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Hasta que numero quieres calcular: ");
        n = in.nextInt();

        for(int i=0; i<n;i++){
            suma+=i;
        }
        System.out.print("Valor de la suma: " + suma);
    }
}
