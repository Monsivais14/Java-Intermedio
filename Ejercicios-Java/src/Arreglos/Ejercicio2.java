
//Escribir un prgrama que tenga un arreglo definido y multiplicar todos sus elementos

package Arreglos;

public class Ejercicio2 {
    public static void main(String []args){

        int num[] = new int[10];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        int multiplica = 1;

        for(int i=0; i<5; i++){
            multiplica*= num[i];
            System.out.println(num[i]);
        }
        System.out.println("Multiplicacion de elemntos: " + multiplica);
    }
}
