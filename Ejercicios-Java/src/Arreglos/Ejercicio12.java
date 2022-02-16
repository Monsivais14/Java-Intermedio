/*
Crear una matriz preguntando el tamaño, llenarla y copiar el contrnido en otra matriz.
por ultimo mostrarla por pantalla
 */
package Arreglos;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        int filas, columnas;

        System.out.print("Inserta el numero de filas: ");
        filas = in.nextInt();
        System.out.print("Inserta el numero de columnas: ");
        columnas = in.nextInt();
        System.out.println("");

        int matrizA[][] = new int[columnas][filas];
        int matrizB[][] = new int[columnas][filas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Inserta un numero: ");
                matrizA[i][j] = in.nextInt();
            }
        }System.out.println("");
        for(int i=0;i<filas;i++){
            for(int j=0;j<filas;j++){
                System.out.print("["+matrizA[i][j]+"]");
            }System.out.println("");
        }
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matrizB[i][j] = matrizA[i][j];
            }
        }System.out.println("");
        for(int i=0;i<filas;i++){
            for(int j=0;j<filas;j++){
                System.out.print("["+matrizB[i][j]+"]");
            }System.out.println("");
        }
    }
}