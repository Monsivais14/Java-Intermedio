/*
Crear una matriz de 3*3 y que esta cree una matriz transpuesta
 */

package Arreglos;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Digite un numero: ");
                matriz[i][j] = in.nextInt();
            }
        }System.out.print("\n");
        for(int i = 0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }System.out.print("\n");
        }System.out.print("\n");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+matriz[j][i]+"]");
            }System.out.print("\n");
        }
    }
}