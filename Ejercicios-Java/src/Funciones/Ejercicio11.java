/*
Crear una funcion que tome como parametros un vector y su tamaño
e imprima un nuevo vector con los impares del vector recibido
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String []args){

        Ejercicio11 eje11 = new Ejercicio11();

        eje11.tamañov();
        double vector[] = new double[(int) t];
        eje11.datos(vector);
        eje11.impares(vector);
    }


    private static double t;
    private void tamañov() {
        Scanner in = new Scanner(System.in);
        System.out.print("Digita el tamaño del vector deseado: ");
        t = in.nextDouble();
    }
    private void datos(double[] vector) {
        Scanner in = new Scanner(System.in);
        for(int i=0; i<t;i++) {
            System.out.print("Digita un numero: ");
            vector[i] = in.nextDouble();
        }
    }
    private void impares(double[] vector){
        double vec[] = new double[(int) t];
        double aux=0;
        for(int i=0;i<t;i++){
            if(vector[i]%2!=0){
                vec[(int) aux]=vector[i];
                aux++;
            }
        }
        for(int i=0;i<aux;i++){
            System.out.print("["+vec[i]+"]");
        }
    }
}