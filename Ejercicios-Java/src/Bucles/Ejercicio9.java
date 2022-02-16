/*
Elaborar un prggrama que haga la suma de numeros factoriales
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){

        int n, suma=0, factorial=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa hasta donde quieres llegar: ");
        n = in.nextInt();

        for(int i=1;i<=n;i++){
            factorial*= i;
            suma+=factorial;
        }
        System.out.print("Siuma de numeros factoriales: "+ suma);
    }
}