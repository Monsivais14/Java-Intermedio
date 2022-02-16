/*
Escribir un programa que clacule una potencia
sin usar la funcion pow
 */

package Bucles;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String []args){

        int x,y,elevacion=1;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el valor de X: ");
        x = in.nextInt();
        System.out.print("Inglresa el valor de Y: ");
        y = in.nextInt();

        for(int i=1; i<=y;i++){
            elevacion*=x;
        }
        System.out.print(elevacion);
    }
}
