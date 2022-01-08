/*
Un constructor se llama igual que su clase

se ejecuta de manera automatica y
ejecuta lo que hay dentro del mismo
sin necesidad de metodos
*/
package clases;
import java.util.Scanner;
public class ConConstructor {
    
    public ConConstructor(){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        
        System.out.print("Nombre: ");
        nombre = in.nextLine();
        
        System.out.println("El nombre es: "+nombre);
    }
}
