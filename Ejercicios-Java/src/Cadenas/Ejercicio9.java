/*
Comprobar si la palabra es palindromo o n o
 */
package Cadenas;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String texto;
        int aux=0, igual=0;

        System.out.print("agrega tu polidormo: ");
        texto = in.nextLine().toLowerCase(Locale.ROOT);

        for(int i=texto.length()-1;i>=0;i--){
           if(texto.charAt(i) == texto.charAt(aux)){
               igual++;
           }
           aux++;
        }
        if(texto.length() == igual){
            System.out.print("Es polidromo");
        }else{
            System.out.print("No es polidromo");
        }
    }
}