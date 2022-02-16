/*
crear una funcion que con la base a una matriz devuelva el menor de los elementos
almacenados en cada fila
 */
package Funciones;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Ejercicio14 eje14 = new Ejercicio14();
        eje14.tamaño();
        double matriz[][] = new double[(int) f][(int) c];
        eje14.datos(matriz);
        System.out.println("El elemento de la fila seleccionada es: "+eje14.nummenor(matriz));
    }
    private static double f;
    private static double c;
    private void tamaño() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digita el numero de filas: ");
        f = in.nextDouble();
        System.out.println("Digita el numero de columnas: ");
        c = in.nextDouble();
    }
    private void datos(double[][] matriz) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<f;i++){
            for(int j=0;j<c;j++){
                System.out.println("Digita un numero: ");
                matriz[i][j] = in.nextDouble();
            }
        }
    }
    private double nummenor(double[][] matriz) {
        double fila;
        int aux=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite el numero a comprobar: ");
        fila = in.nextDouble();

        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                if(i == fila){
                    if(matriz[i][j]<aux){
                        aux = (int) matriz[i][j];
                    }
                }
            }
        }
        return aux;
    }
}