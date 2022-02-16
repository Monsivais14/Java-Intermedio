/*
Realizar un programa que solicite a un usuario pensar en un numero entre 1 y 100
el programa debe generar esos numeros de manera aleatoria y preguntar al usuario si
es mayor o mejor hasta encontrar el numero del usuario y mostrar los intentos que le llevo
 */
package Bucles;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio13 {
    public static void main(String []args){

        int n,numAI=15, contador=0;
        int min=1,max=100;
        Scanner in = new Scanner(System.in);
        numAI = (int) (Math.random()*(min+max));
        do{
            System.out.print("inserta un numero: ");
            n = in.nextInt();
            if(n > numAI){
                System.out.print("menos\n");
            }else if(n < numAI){
                System.out.print("mas\n");
            }
            contador++;
        }while(n != numAI);

        System.out.print("Adivinaste el numero\n");
        System.out.print("Numero de intentos "+contador);
    }
}