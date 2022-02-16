/*
Pedir dos cadenas de caracteres de numeros, uno entero y otro real
convertirlos a sus prespectivo valores y sumarlos
 */
package Cadenas;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String []args){

        String cad1,cad2;
        int num1;
        float suma, num2;
        Scanner in = new Scanner(System.in);

        System.out.print("Inserta un valor numerico: ");
        cad1 = in.nextLine();
        System.out.print("Inserta un valor decimal: ");
        cad2 = in.nextLine();

        num1 = Integer.parseInt(cad1);
        num2 = Float.parseFloat(cad2);
        suma = num1 + num2;

        System.out.print("La suma de los valores es: "+suma);
    }
}
