/*
Escribir un programa que calcule el valor de un numero elevado al cuadrado hasta n
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String []args){

        double n,suma=0,elevacion=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el valor limite: ");
        n = in.nextInt();

        for(int i=1;i<=n; i++){
            elevacion = Math.pow(2,i);
            suma+=elevacion;
        }
        System.out.print("Total: " + suma);
    }
}
