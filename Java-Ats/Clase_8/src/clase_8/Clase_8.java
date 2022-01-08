
package clase_8;

import java.util.Scanner;

public class Clase_8 {

    //Clase Scanner
    public static void main(String[] args) {
        
        //almacenar numeros
        Scanner in = new Scanner(System.in); //in es objeto de clase Scanner 
        double numero;
        
        System.out.println("Digita un numero:");
        numero = in.nextDouble(); //almacena el valor digitado dentro de la variable numero
        //se utiliza next y el tipo de dato primitivo a almacenar
        
        System.out.println("El numero es: "+numero+"\n");
        
        //almacenar cadenas
        Scanner entrada = new Scanner(System.in);
        String cadena;
        
        System.out.println("Ingresa una cadena de caracteres");
        cadena = entrada.nextLine(); //next almacena una cadena hasta encontrar un espacio,
        //mientras nextLine completamente todo
        
        System.out.println("La cadena es: "+cadena);
    }
    
}
