/*
Calcular un la siguiente funcion de F(x,y) = raiz(x) / y2-1
 */
package Expresiones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio8 {
    public  static void main(String []args){

        double x,y, resultado;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00000");

        System.out.print("Ingresa el valor de X: ");
        x = in.nextInt();
        System.out.print("Ingresa el valor de Y: ");
        y = in.nextInt();

        resultado = (Math.sqrt(x)/ (Math.pow(y,2)-1));
        System.out.print("EL resultado de la formula es: "+df.format(resultado));
    }
}
