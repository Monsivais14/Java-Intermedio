/*
Realizar una seire fibonacci
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int n;
        int a=0,b=1,c=1;

        System.out.print("ingresa un valor: ");
        n = in.nextInt();

        for(int i=1; i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}