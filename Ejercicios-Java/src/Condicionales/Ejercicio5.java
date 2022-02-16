package Condicionales;//comprobar si una vocal es mayuscula o minuscula

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String []args){

        String letra;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa una vocal");
        letra = in.nextLine();

        switch(letra){

            case "a":
                System.out.println("Es una vocal minuscula");
                break;
            case "e":
                System.out.println("Es una vocal minuscula");
                break;
            case "i":
                System.out.println("Es una vocal minuscula");
                break;
            case "o":
                System.out.println("Es una vocal minuscula");
                break;
            case "u":
                System.out.println("Es una vocal minuscula");
                break;

            default: System.out.println("No es una vocal minuscula");
            break;
        }
    }
}
