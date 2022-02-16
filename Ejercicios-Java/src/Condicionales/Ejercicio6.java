package Condicionales;//Escribir un programa que indique si un dato es vocal minuscula o mayuscula o no es una vocal

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){

        char letra;
        Scanner in = new Scanner(System.in);

        System.out.println("ingresa una vocal");
        letra = in.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("Es una vocal minuscula ");
        } else if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
            System.out.println("Es una vocal mayuscula ");
        }else{
            System.out.println("No es una vocal");
        }
    }
}
