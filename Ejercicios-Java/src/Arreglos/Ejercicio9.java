/*
Hacer un prgrama para rellenar una matriz pidiendo el usuario
el numero de filas y columnas luego de mostrar la matriz
*/
package Arreglos;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int f = 0;
        int c = 0;

        System.out.print("Ingresa el numero de filas: ");
        f = in.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        c = in.nextInt();

        int vector[][] = new int[f][c];

        for(int i=0;i<f;i++){
            for(int j=0;j<c; j++) {
                System.out.println("Ingresa un numero:");
                vector[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<c; j++) {
                System.out.print("[" + vector[i][j] + "]");
            }System.out.println("");
        }
    }
}