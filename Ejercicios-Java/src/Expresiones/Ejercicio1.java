//Resolver a+b / c+d
package Expresiones;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String []args){

        int a,b,c,d,calculo;
        Scanner in = new Scanner(System.in);

        System.out.print("ingresa el valor de a: ");
        a = in.nextInt();
        System.out.print("ingresa el valor de b: ");
        b = in.nextInt();
        System.out.print("ingresa el valor de c: ");
        c = in.nextInt();
        System.out.print("ingresa el valor de d: ");
        d = in.nextInt();

        calculo = (a+b)/(c+d);
        System.out.print("El resultado es: "+calculo);
    }
}
