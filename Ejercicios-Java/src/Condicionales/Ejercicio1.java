package Condicionales;
/*
Leer dos numeros y determinar cual de los dos es mayor
*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String []args){

        int num1,num2;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa dos numeros numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if(num1 == num2){
            System.out.println("Son numeros iguales");
        }else if(num1 > num2){
            System.out.println("El mayor es: " + num1);
        }
        else{
            System.out.println("El mayor es: " + num2);
        }
        System.exit(0);
    }
}