/*
Solicitar numero y cuando entre un cero
se detiene el programa y te mostrara los datos ingresados
 */

package Bucles;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String []args){

    Scanner in = new Scanner(System.in);
    int num, aux;

    do{
        System.out.print("Ingresa un numero: ");
        num = in.nextInt();
     }while (num != 0);

      aux = num;
      System.out.print("Numero ingresado:"+aux);
    }
}
