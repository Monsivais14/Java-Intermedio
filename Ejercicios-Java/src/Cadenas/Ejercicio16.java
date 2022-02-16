/*
Pedir una cadena por consola y mostrar cuantas ocurrencias
de cada vocal existen en la cadena
 */
package Cadenas;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        String frase;
        int va=0,ve=0,vi=0,vo=0,vu=0;

        System.out.print("Digita una frase: ");
        frase = in.nextLine();

        for(int i=0;i<frase.length();i++){
            switch (frase.charAt(i)){
                case 'a':
                    va++;
                    break;
                case 'e':
                    ve++;
                    break;
                case 'i':
                    vi++;
                    break;
                case 'o':
                    vo++;
                    break;
                case'u':
                    vu++;
                    break;
            }
        }
        System.out.println("Vocal a: "+va);
        System.out.println("Vocal e: "+ve);
        System.out.println("Vocal i: "+vi);
        System.out.println("Vocal o: "+vo);
        System.out.println("Vocal u: "+vu);
    }
}
