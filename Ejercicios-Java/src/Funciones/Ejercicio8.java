/*
PAso de parametro de tipo vector
 */
package Funciones;

public class Ejercicio8 {
    public static void main(String []args){

        int size = 5;
        int vector[] = new int[size];
        vector[0]=1;vector[1]=2;vector[2]=3;vector[3]=4;vector[4]=5;

        cuadrado(vector,size);
        mostrarVector(vector,size);
    }
    private static void cuadrado(int vector[], int size){
        for(int i=0;i<size;i++){
            vector[i]*=vector[i];
        }
    }
    private static void mostrarVector(int vector[], int size) {
        for(int i=0;i<size;i++){
            System.out.print("["+vector[i]+"]");
        }
    }
}