package Condicionales;
//Hacer un menu que pida sacar el cubo de un numero
//ver si es un numero par o impar
//y salir

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String []args){

        int num1, opcion;
        double resultado;
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("1. Calcular cubo");
        System.out.println("2. Numero par o impar");
        System.out.println("3. Salir");
        opcion = in.nextInt();

        switch (opcion){
            case 1:
                System.out.println("ingresa el numero");
                num1 = in.nextInt();
                resultado = Math.pow(num1, 3);
                System.out.println("El cubo del numero es: " + resultado);
                break;
            case 2:
                System.out.println("Ingresa un numero");
                num1 = in.nextInt();
                if(num1%2==0){
                    System.out.println("El numero es par");
                }else{
                    System.out.println("El numero es impar");
                }
                break;
            case 3: System.exit(0);

            default:
                System.out.println("Esa opcion no existe");
        }
    }
}
