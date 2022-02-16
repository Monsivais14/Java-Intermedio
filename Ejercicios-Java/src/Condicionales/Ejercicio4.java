package Condicionales;//Comprobar si un numero es positivo o negativo

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){

        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        num = in.nextInt();

        if(num == 0){
            System.out.println("El numero " + num + " es neutral");
        }
        else if(num >= +1){
            System.out.println("El numero " + num + " es positivo");
        }
        else if(num <= -1){
            System.out.println("El numero " + num + " es negativo");
        }
    }
}