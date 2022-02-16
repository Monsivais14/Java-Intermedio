/*
Hacer un prgrama que lea valores enteros
hasta que se introduca un valor de rango [20-30] o el valor 0
entregar la suma de los valores mayores a 0 introducidos
 */

package Bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int numero,suma=0;

        do{
             System.out.print("Intoduzca un numero: ");
             numero = in.nextInt();
             if(numero>0){                /*Mientras de un false, el while termina*/
             suma+=numero;
             }
        }while ((numero <20||numero>30) && numero!=0);
        System.out.print("Suma de los numeros: " + suma);
    }
}