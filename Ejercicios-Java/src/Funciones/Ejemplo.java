//Encontrar el mayor de dos numeros
package Funciones;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        int n1,n2,mayor;

        System.out.print("Digita el primer numero: ");
        n1 = in.nextInt();
        System.out.print("Digita el segundo numero: ");
        n2 = in.nextInt();

        mayor = numMayor(n1,n2);
        System.out.print("El numero mayo es: "+mayor);
    }
    //  definicion de funcion
    private static int numMayor(int x, int y) {
        int numMax;
        if(x>y){
            numMax=x;
        }else{
            numMax=y;
        }
        return numMax;
    }
}