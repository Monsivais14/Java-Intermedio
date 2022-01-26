package clase_47;

import java.util.Scanner;

public class Clase_47 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false;
        boolean decrecientte = false;

        for (int i = 0; i <arreglo.length; i++) {//llenar arreglo
            System.out.print("(" + (i + 1) + ")Digite un numero: ");
            arreglo[i] = in.nextInt();
        }

        for (int i = 0; i <arreglo.length-1; i++) { //es length-1 por que si llega a el maximo dara fuera de array
            if (arreglo[i] < arreglo[i + 1]) {//es menor que el numero que le continua
                //= a arreglo creciente activando booleano
                creciente = true;
            }
            if (arreglo[i] > arreglo[i + 1]) {//es mayor que el numero que le continua
                decrecientte = true;
            }
        }

        if (creciente == true && decrecientte == false) {
            System.out.println("El arreglo esta en forma creciente");
        } else if (creciente == false && decrecientte == true) {
            System.out.println("El arreglo es ta de manera decreciente");
        }else if(creciente==true&&decrecientte==true){
            //significa que en algunos momentos esta creciente y en algunos decreciente
            System.out.println("El arreglo esta desordenado");
        }else if(creciente==false&&decrecientte==false){
            //para que lleguen a ser iguales nunca habra un creciente ni decreciente
            //por que los numeros almacenados son completamente iguales
            System.out.println("El arreglo tiene todos los numeros iguales");
        }

    }

}
