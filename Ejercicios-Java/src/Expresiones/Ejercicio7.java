//Leer dos catetos de un triangulo rectangulo y escribir la salida de su hipotenusa
package Expresiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String []args){

        double cateto1,cateto2,hipotenusa;
        DecimalFormat df = new DecimalFormat("#.000");
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa el valor del cateto a: ");
        cateto1 = in.nextDouble();
        System.out.print("Ingresa el valor del cateto b: ");
        cateto2 = in.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(cateto1,2)+(Math.pow(cateto2,2)));
        System.out.print("El valor de la hipotenusa es: "+df.format(hipotenusa));
    }
}
