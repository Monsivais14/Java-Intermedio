/*
Determinar si una matris es simetrica o no
 */
package Arreglos;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int filas, columnas;
        char simetrica = 'F';

        System.out.print("Ingresa el numero de filas: ");
        filas = in.nextInt();
        System.out.print("Ingresa el numero de columnas: ");
        columnas = in.nextInt();
        int matriz[][] = new int[filas][columnas];

        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("Inserta un numero: ");
                matriz[i][j]=in.nextInt();
            }
        }
            for (int i=0; i<filas;i++) {
                for (int j=0; j<columnas;j++) {
                    if (matriz[i][j] == matriz[j][i]) {
                        System.out.print("SI");
                        simetrica = 'V';
                    }
                }
            }
        if(simetrica == 'V'){
            System.out.print("Es una matriz simetrica");
        } else{
            System.out.print("La matriz no es simetrica");
        }
    }
}