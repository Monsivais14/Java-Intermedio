/*
Comprobar si una matriz es simetrica o no por media de una funcion
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Ejercicio13 eje13 = new Ejercicio13();
        eje13.tamaño();
        double matriz[][] = new double[(int) f][(int) c];
        eje13.datos(matriz);
        eje13.esSimetrica(matriz);

    }
    private static double f;
    private static double c;
    private void tamaño() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digita el numero de filas: ");
        f = in.nextDouble();
        System.out.print("Digita el numero de columnas: ");
        c = in.nextDouble();
    }
    private void datos(double[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                System.out.print("DIgita un numero: ");
                matriz[i][j]= in.nextDouble();
            }
        }
    }
    private void esSimetrica(double[][] matriz) {
        int cont=0;
        if(f==c){
            for(int i=0;i<f;i++){
                for(int j=0;j<c;j++){
                    if(matriz[i][j]==matriz[j][i]){
                        cont++;
                    }
                }
            }
        }
        if(cont==f*c){
            System.out.print("La matriz es simetrica");
        }else{
            System.out.println("la matriz no es simetrica");
        }
    }
}