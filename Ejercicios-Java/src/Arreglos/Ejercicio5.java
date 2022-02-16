
//Desarrollar un prgrama que lea los numeros de un vector
// y determine el mayor elemento del vector

package Arreglos;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String []args){

        int elementos = 0, mayor = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        elementos = in.nextInt();
        int vector[] = new int[elementos];

        for(int i=0; i<elementos;i++){
            System.out.print("Ingresa un valor: ");
            vector[i] = in.nextInt();

            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        System.out.println("El numero mayor es " + mayor);
    }
}
