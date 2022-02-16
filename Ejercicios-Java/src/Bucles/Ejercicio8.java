/*
Escribir un prgrama que calcule el valor 1*2*3 hasta n Factorial
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String []args){

        int n, factorial=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el numero factorial que quieres: ");
        n = in.nextInt();

        for(int i=1;i<=n;i++){
            factorial= factorial*i;
        }
        System.out.print("Resultado: "+factorial);
    }
}