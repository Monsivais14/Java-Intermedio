/*
Definir dos vectores de caracteres y desppues almacenar el contenido de ambos en un tercer
vector situando el primer lugar los elementos del primer vector y seguido de los elementos
del segundo vector. y mostrar el contenido del nuevo vector
*/
package Arreglos;

public class Ejercicio7 {
    public static void main(String []args){

        char mensaje[] = new char[5];
        mensaje[0] = 'a';mensaje[1] = 'b';mensaje[2] = 'c';
        mensaje[3] = 'd';mensaje[4] = 'g';
        char mensaje2[] = new char[5];
        mensaje2[0] = 'r';mensaje2[1] = 'e';mensaje2[2] = 'u';
        mensaje2[3] = 's';mensaje2[4] = 'g';
        char nuevovector[] = new char[10];

        for(int i=0; i<5;i++){
            nuevovector[i] = mensaje[i];
        }
        for(int i=5; i<10;i++){
            nuevovector[i] = mensaje2[i-5];
        }

        System.out.println("Datos del nuevo vector: ");

        for(int i=0;i<10;i++){
            System.out.print("[" + nuevovector[i] + "]");
        }
    }
}