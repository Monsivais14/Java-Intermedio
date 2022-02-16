//Comparar cadenas
package Cadenas;
import  java.util.Scanner;
public class Ejercicio5 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String palabra1;
        String palabra2;

        System.out.print("Escribe la primer palabra: ");
        palabra1 = in.nextLine().trim();
        System.out.print("Escribe la segunda palabra: ");
        palabra2 = in.nextLine().trim();

        if(palabra1.equals(palabra2)){
            System.out.print("iguales");
        }else{
            System.out.print("diferentes");
        }
    }
}
