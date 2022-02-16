/*
Escribir un programa que calcule
el valor de un n numero 2n-1
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){

        int numero,suma=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Inserta hasta donde quieres calcular: ");
        numero = in.nextInt();

        for(int i=1; i<=2*numero-1; i+=2){
            suma+=i;
        }
        System.out.print("Total de los numeros "+suma);
    }
}