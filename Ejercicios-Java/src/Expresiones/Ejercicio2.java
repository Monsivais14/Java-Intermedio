//hacer la siguiente expresion: (a+ (b/c)) / (d+ (c/f))
package Expresiones;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.000");
        double a,b,c,d,e,f,calculo;

        System.out.print("Ingresa el valor de a: ");
        a = in.nextInt();
        System.out.print("Ingresa el valor de b: ");
        b = in.nextInt();
        System.out.print("Ingresa el valor de c: ");
        c = in.nextInt();
        System.out.print("Ingresa el valor de d: ");
        d = in.nextInt();
        System.out.print("Ingresa el valor de e: ");
        e = in.nextInt();
        System.out.print("Ingresa el valor de f: ");
        f = in.nextInt();

        calculo = (a+(b/c)) / (d+(e/f));
        System.out.print("El calculo es: "+df.format(calculo));
    }
}