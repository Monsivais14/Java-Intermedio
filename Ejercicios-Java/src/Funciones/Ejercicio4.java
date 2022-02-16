/*
Devolver valores multiples
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int num1,num2;
        int suma=0,prod=0;

        System.out.println("Digite dos numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        Ejercicio4 eje4 = new Ejercicio4();
        calculo(num1,num2,eje4,eje4);

        suma = eje4.sum;
        prod = eje4.pro;

        System.out.println("Valor de la suma: "+suma);
        System.out.print("Valor del producto: "+prod);
    }
    public int sum;
    public int pro;
    private static void calculo(int num1,int num2,Ejercicio4 suma,Ejercicio4 prod){
        suma.sum = num1+num2;
        prod.pro = num1*num2;
    }
}