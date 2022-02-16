
//Definir un arreglo de numeros y calcular la suma de sus elementos

package Arreglos;

public class Ejercicio1 {
    public static void main(String []args){

        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        int suma = 0;

        for(int i=0; i<5; i++){
            suma+= num[i];
            System.out.println(num[i]);
        }
        System.out.println("Suma de elementos: " + suma);
    }
}
