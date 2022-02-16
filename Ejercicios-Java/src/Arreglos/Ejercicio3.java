
//Crear un vector que lea la entrada de numeros y
//muestre en la salida los numeros correspondientes

package Arreglos;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int a = 0;

        System.out.print("Ingresa el tamaño del arreglo: ");
        a = in.nextInt();
        int numero[] = new int[a];

        for(int i=0; i<a; i++){
            System.out.print("Agrega un numero: ");
            numero[i] = in.nextInt();
        }
        System.out.println("");
        for(int i=0; i<a; i++){
            System.out.print("[" + numero[i] + "]");
        }
    }
}
