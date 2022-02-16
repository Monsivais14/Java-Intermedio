/*
Escribir un programa que lea dos numeros y muestra la suma
de estos, multiplicacion y diviasion
 */
package Basico;

import java.util.Scanner;

public class Operaciones {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int num1,num2;
        int sum=0,rest=0,mult=0,div=0;

        System.out.print("Ingrese el primer numero: ");
        num1 = in.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = in.nextInt();

        sum = num1+num2;
        rest = num1-num2;
        mult = num1*num2;
        div=num1/num2;

        System.out.print("la suma es: "+sum);
        System.out.print("la resta es: "+rest);
        System.out.print("la multiplicacion es: "+mult);
        System.out.print("la division es: "+div);
    }
}