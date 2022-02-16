/*
Realizar la suma de dos matrices cuadradas de 3*3
 */

package Arreglos;

public class Ejercicio14 {
    public static void main(String []args){

        int matrizA[][] = new int[3][3];
        matrizA[0][0]=1;matrizA[0][1]=2;matrizA[0][2]=3;
        matrizA[1][0]=4;matrizA[1][1]=5;matrizA[1][2]=6;
        matrizA[2][0]=7;matrizA[2][1]=8;matrizA[2][2]=9;
        int matrizB[][] = new int[3][3];
        matrizB[0][0]=4;matrizB[0][1]=2;matrizB[0][2]=6;
        matrizB[1][0]=3;matrizB[1][1]=8;matrizB[1][2]=1;
        matrizB[2][0]=9;matrizB[2][1]=5;matrizB[2][2]=6;
        int matrizR[][] = new int[3][3];

        System.out.print("\n");

        System.out.print("matriz 1 \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matrizA[i][j]+"]");
            }System.out.print("\n");
        }

        System.out.print("\n");

        System.out.print("Matriz 2 \n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matrizB[i][j]+"]");
            }System.out.print("\n");
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrizR[i][j] = matrizA[i][j] + matrizB[i][j];
            }System.out.print("\n");
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matrizR[i][j]+"]");
            }System.out.print("\n");
        }
    }
}
