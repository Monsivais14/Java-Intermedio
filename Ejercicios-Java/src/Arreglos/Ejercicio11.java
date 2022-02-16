/*
Hacer una matriz de tipo entera de 2*2, llenarla de numeros y copiarla en una nueva
*/
package Arreglos;

public class Ejercicio11 {
    public static void main(String []args){

        int matrizA[][] = new int[2][2];
        matrizA[0][0]=1; matrizA[0][1]=2;
        matrizA[1][0]=3; matrizA[1][1]=4;
        int matrizB[][] = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrizB[i][j] = matrizA[i][j];
            }
        }
        System.out.println("Matriz de copia:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("["+matrizB[i][j]+"]");System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
