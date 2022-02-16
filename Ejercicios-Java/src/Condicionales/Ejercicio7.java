package Condicionales;//Solicitar una edad entera e indicar si la edad introducida esta en el rango de 10 a 25

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){

        int edad;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        edad = in.nextInt();

        if(edad >= 10 && edad <=25){
            System.out.println("Estas en el rango de edad");
        }else{
            System.out.println("Estas fuera del rango de edad");
        }
    }
}