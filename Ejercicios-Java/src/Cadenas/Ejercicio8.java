/*
invertir una cadena
 */
package Cadenas;

public class Ejercicio8 {
    public static void main(String []agrs){

        String cad="Anita lava la tina";
        StringBuilder strb = new StringBuilder(cad);
        cad = strb.reverse().toString();
        System.out.print(cad);
    }
}