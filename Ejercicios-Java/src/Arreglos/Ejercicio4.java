
//Crear un vector que muestre en orden inverso

package Arreglos;

public class Ejercicio4 {
    public static void main(String []args){

        int vector[] = new int[5];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
        vector[3] = 4;
        vector[4] = 5;

        for(int i=4; i>=0; i--){
            System.out.println(vector[i]);
        }
    }
}
