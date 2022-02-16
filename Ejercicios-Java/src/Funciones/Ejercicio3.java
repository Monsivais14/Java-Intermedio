/*
paso por referencia
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("DIgite dos numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        valNuevo(num1,num2);
    }
    private static void valNuevo(int x,int y){
        System.out.println("El valor del primer numero es: "+x);
        System.out.print("El valor del segundo numero es: "+y);
    }
}