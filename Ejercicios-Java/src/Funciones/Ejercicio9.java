/*
Realizar una funcion que tome como parametros un vector y devuelva la suma
de sus elementos
 */
package Funciones;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){

        Ejercicio9 eje9 = new Ejercicio9();

        eje9.tamañov();
        float suma = 0;
        float size = t;
        float[] vector = new float[(int) size];
        eje9.digito(vector);

        for(int i=0;i<t;i++) {
            suma+=vector[i];
        }
        System.out.println("La suma de los datos es : "+suma);
    }
    private static float t;

    private void tamañov(){
        Scanner in = new Scanner(System.in);
        float size;
        System.out.print("Digite el tamaño del vector: ");
        size = in.nextFloat();
        t = size;
    }

    private void digito(float vector[]) {
        Scanner in = new Scanner(System.in);
        for(int i=0;i<t;i++){
            System.out.print("Digita un numero: ");
            vector[i] = in.nextFloat();
        }
    }
}