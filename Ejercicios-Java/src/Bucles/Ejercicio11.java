/*
Hacer un programa que calcule el resultado de 1-2+3-4+5-5...n
 */
package Bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n, par=0,impar=0, negativo=0, suma=0;

        System.out.print("Ingresa el numero: ");
        n = in.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                negativo= i * -1;
                par += negativo;
            }else{
                impar += i;
            }
        }
        suma= par + impar;
        System.out.print(suma);
    }
}
