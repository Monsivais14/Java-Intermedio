//Hacer un intercambio de valores
package Expresiones;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String []args){
        int x,y,aux;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresar x: ");
        x = in.nextInt();
        System.out.print("Ingresa el valor de y: ");
        y = in.nextInt();

        aux = x;
        x=y;
        y=aux;

        System.out.println("Nuevo x: "+x);
        System.out.println("nuevo y: "+y);
    }
}