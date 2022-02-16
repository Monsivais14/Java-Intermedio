//Hacer la siguiente expresion a+b/c-d
package Expresiones;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        double a,b,c,d,calculo;

        System.out.print("Ingresa el valor de a: ");
        a = in.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = in.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c = in.nextInt();
        System.out.print("Ingresa el valor de d: ");
        d = in.nextInt();

        calculo = a+b/(c-d);
        System.out.print("El resultado es: "+calculo);
    }
}
