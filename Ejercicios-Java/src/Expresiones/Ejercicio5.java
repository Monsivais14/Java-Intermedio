//leer una nota de cuatro alumnos y calcular la nota final de los cuatro alumnos
package Expresiones;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String []args){

        double a1,a2,a3,a4,total;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa primea nota: ");
        a1 = in.nextInt();
        System.out.print("Ingresa segunda nota: ");
        a2 = in.nextInt();
        System.out.print("Ingresa tercera nota: ");
        a3 = in.nextInt();
        System.out.print("Ingresa cuarta nota: ");
        a4 = in.nextInt();

        total = (a1+a2+a3+a4)/4;
        System.out.print("La nota media es de: "+total);
    }
}