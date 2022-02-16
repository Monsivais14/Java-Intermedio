//Escribir un programa que calcule la fomula general

package Expresiones;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){

        double a,b,c,r1,r2;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el valor de a: ");
        a = in.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = in.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c = in.nextInt();

        r1 = (-b + Math.sqrt(Math.pow(b,2)) -4*a*c)/(2*a);
        r2 = (-b - Math.sqrt(Math.pow(b,2)) -4*a*c)/(2*a);

        System.out.println("El resultado 1 es: "+r1);
        System.out.println("El resultado 2 es: "+r2);
    }
}