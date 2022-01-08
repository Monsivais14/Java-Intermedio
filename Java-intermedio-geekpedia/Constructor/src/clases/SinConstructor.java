
package clases;
import java.util.Scanner;

public class SinConstructor {
    
    public Scanner in = new Scanner(System.in);
    String nombre = "";
    
    public void Nombre(){
        System.out.print("Nombre: ");
        nombre = in.nextLine();
    }
    public void Imprimir(){
        System.out.print("El nomrbe es: "+nombre);
    }
}