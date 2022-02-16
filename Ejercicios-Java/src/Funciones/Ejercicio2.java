/*
Escribir una funcion que calcule de el valor
que se le manda, esta debera ser capaz de elebar al cuadrado numeros flotantes
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        float mayor;
        mayor=pedirNum();
        cuadradonum(mayor);
    }

    private static float pedirNum(){
        float num;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        num = in.nextFloat();
        return num;
    }

    private static void cuadradonum(float n){
        float dato = 0;
        dato = (float) Math.pow(n,2);
        System.out.print("El cuadrado del numero es: "+dato);
    }
}