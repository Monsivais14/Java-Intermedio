package clase_44;

import java.util.Iterator;
import java.util.Scanner;

public class Clase_44 {

    public static void main(String[] args) {
        
        float[] numeros = new float[5];
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Guardando los datos dentro del arreglo...");
        for (int i=0; i<numeros.length; i++) {
            System.out.print("("+(i+1)+") Digita un nuemero: ");
            numeros[i] = in.nextFloat();
        }
        
        System.out.println("\nImprimiendo campos de los elementos...");
        for(float i : numeros){
            System.out.println("["+i+"]");
        }
        
    }

}
