package Condicionales;
// Pedir 3 numeros y ver cual es el mayor

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String []args){

        int num1,num2,num3;
        Scanner in = new Scanner(System.in);

        System.out.println("Porfavor Ingresa 3 numeros");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("\nLos numeros dados son iguales");
        }else if(num1 > num2 && num1 > num3){
            System.out.println("\nEl mayor es: " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("\nEl mayor es: " + num2);
        }else if(num3 > num1 && num3 > num2){
            System.out.println("\nEl mayor es: " + num3);
        }
    }
}