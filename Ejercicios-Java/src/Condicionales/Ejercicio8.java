package Condicionales;//ingresar tres numeros y luego agregar un 4 numero y comprobar si este coincide con alguno anterior

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String []args){

        int num1,num2,num3;
        int extra;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa 3 numeros: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();

        System.out.println("Ingresa el otro numero");
        extra = in.nextInt();

        if(extra == num1 || extra == num2 || extra == num3){
            System.out.println("El numero coincide con uno previamente ingresado");
        }else{
            System.out.println("El numero no coincide con ninguno previamente ingresado");
        }
    }
}
