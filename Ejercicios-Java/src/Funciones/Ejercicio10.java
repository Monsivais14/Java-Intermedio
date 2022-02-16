/*
Realizar una funcion que tome por parametros un vector y su tamaño
y cambiar el signo de los elementos
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String []args){

        Ejercicio10 eje10 = new Ejercicio10();
        eje10.tamañov();
        double vector[] = new double[(int) t];
        eje10.datos(vector);
        eje10.cambias(vector);
        eje10.mostrar(vector);


    }
    private static double t;
    private void tamañov() {
        Scanner in = new Scanner(System.in);
        float size;
        System.out.print("Digite el tamaño del vector: ");
        t = in.nextFloat();
    }
    private void datos(double[] vector) {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<t;i++){
            System.out.print("Digita un numero: ");
            vector[i] = in.nextFloat();
        }
    }
    private void cambias(double[] vector) {
        for(int i=0;i<t;i++){
            vector[i]*= -1;
        }
    }
    private void mostrar(double[] vector) {
        for(int i=0;i<t;i++){
            System.out.print("["+vector[i]+"]");
        }
    }
}