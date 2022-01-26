
package clase_48;

import java.util.Scanner;

public class Clase_48 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int[] arreglo = new int[10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        
        for (int i=0;i<10;i++) {
            System.out.print("Digita un numero: ");
            arreglo[i] = in.nextInt();
        }
        
        ultimo = arreglo[9];//ultimo elemento del array
        
        for (int i=8; i>=0;i--) {
            arreglo[i+1] = arreglo[i];
            /*el arreglo de adelante sera igual al 
            pasado para desplazar el array, ejemplo el array[9] sera igual
            a el 8 depues el 8 sera igual a el 7 y asi hasta finalizar >=0 */
        }
        
        arreglo[0] = ultimo;
        
        for (int i : arreglo) {
            System.out.println(i);
        }
        
    }
    
}
