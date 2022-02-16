package Condicionales;//Determinar si un numero es par o impar

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Imgresa un numero");
        num = in.nextInt();

        if(num%2==0){
            System.out.println("El numero " + num + " es par");
        }else if(num%2==1){     // se puede solamente usando nu else //
            System.out.println("El numero " + num + " es impar");
        }
    }
}