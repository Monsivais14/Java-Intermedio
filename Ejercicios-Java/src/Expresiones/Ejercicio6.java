/*
La calificacion final de un alumno es la media ponderada de tres notas
practicas es de 30%
teorica es 60%
participacion 10%
Calcular la nota final
 */
package Expresiones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){

        double practica, teorica, participacion;
        double notafinal = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa puntuacion en practica: ");
        practica = in.nextDouble();
        System.out.print("Ingresa puntuacion en teorica: ");
        teorica = in.nextDouble();
        System.out.print("Ingresa puntuacion en participacion: ");
        participacion = in.nextDouble();

        practica*=0.30;
        teorica*=0.60;
        participacion*=10;
        notafinal = practica+teorica+participacion;
        notafinal/=100;
        System.out.print("La nota final es: "+notafinal);
    }
}