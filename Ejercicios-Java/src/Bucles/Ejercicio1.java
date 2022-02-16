/*
Pedir un numero por consola y que de este
nos muestre su tabla de multiplicar
 */
package Bucles;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int num=0;

        do{
            System.out.print("Ingresa un numero: ");
            num = in.nextInt();
        } while (num <1 || num>10);

        for(int i=1;i<=20;i++){
            System.out.print(num + "*" + i + ":" + num*i +"\n");
        }
    }
}