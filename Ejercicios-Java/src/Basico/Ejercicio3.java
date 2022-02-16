/*
Realice un programa que lea una entrada de
edad int,sexo char,altura float.

tras leerlos debe mostrarlos el programa
 */
package Basico;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int edad;
        char sexo;
        float altura;

        System.out.print("Ingresa la edad: ");
        edad = in.nextInt();
        do{
           System.out.print("Ingresa el sexo M/F: ");
           sexo = in.next().charAt(0);
       }while(!(sexo =='M') && !(sexo =='F'));
        System.out.print("Ingreso la altura: ");
        altura = in.nextFloat();

        System.out.println("");
        System.out.println("Los datos son: ");
        System.out.println("La edad es: "+edad);
        System.out.println("El sexo es: "+sexo);
        System.out.println("La altura es: "+altura);
    }
}