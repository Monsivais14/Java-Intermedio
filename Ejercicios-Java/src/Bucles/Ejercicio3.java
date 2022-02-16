/*
Hacer un programa que calcule y muestre
la suma de los cuadrados de 10 numeros mayores a 0 ingresados por consola
 */
package Bucles;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int suma=0;
        int val[] = new int[10];
        int cuadrado[] = new int[10];

        for(int i=0;i<=9;i++){
            int k = i+1;
            System.out.print("Ingresa el valor numero " + k +" : ");
            val[i] = in.nextInt();
        }
        for(int i=0;i<=9;i++){
            int k = i+1;
            cuadrado[i] = val[i] * val[i];
            System.out.print("Cuadrado "+k+" : "+ cuadrado[i] + "\n");
        }
        for(int i=0;i<=9;i++){
            suma+=cuadrado[i];
        }
        System.out.print("Suma de los duadrados:" + suma);
    }
}