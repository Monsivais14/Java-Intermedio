/*
Realizar la suma de numeros complejos
 */
package Funciones;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Ejercicio16 eje16 = new Ejercicio16();

        eje16.pedirdatos();
        eje16.complejos();
        eje16.mostrar();
    }
    private float real,imaginario,z1,z2;

    private void pedirdatos() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresando el prumer numero completo: ");
        System.out.println("inserta la primera real: ");
        real = in.nextFloat();
        System.out.println("Inserta la parte imaginaria: ");
        imaginario = in.nextFloat();
        System.out.println("");
        System.out.println("Ingresando el segundo numero complejo: ");
        z2 = in.nextFloat();
        System.out.println("Ingresando la parte imaginaria: ");
        z1 = in.nextFloat();
    }
    private float complejos() {
        real+=z2;
        z1=+imaginario;
        return z1;
    }
    private void mostrar() {
        System.out.println("Resultado de la suma "+real+" "+z1);
    }
}