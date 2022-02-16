/*
Hacer un programa que lea 5 numeros en un arreglo y los copie
en otro una vez copiados, que multiplique cada valor por 2 y muestre un segundo arreglo
*/
package Arreglos;

public class Ejercicio8 {
    public static void main(String []args){

        int num[] = new int[5];
        num[0]=1; num[1]=2; num[2]=3; num[3]=4; num[4]=5;

        int num2[] = new int[5];

        for(int i=0; i<5; i++){
            num2[i] = num[i];
        }
        for(int i=0; i<5;i++){
            num2[i]*=2;
            System.out.println(num2[i]);
        }
    }
}
