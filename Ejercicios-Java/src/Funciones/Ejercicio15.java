//Paso de parametros de tipo estatura
package Funciones;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Ejercicio15 eje15 = new Ejercicio15();
        eje15.datos();
        eje15.verdatos();
    }
    private static String personan;
    private static int edad;
    private void datos() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        personan = in.nextLine();
        System.out.println("Digite su edad: ");
        edad = in.nextInt();
    }
    private void verdatos() {
        System.out.println(personan);
        System.out.println(edad);
    }
}