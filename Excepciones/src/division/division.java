/*
Manejo de errores en Java
*/
package division;
import java.util.Scanner;
public class division {
    public static void main(String []args){
    try{  //dentro del try va todo el codigo 
         int valor1,valor2,resultado;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Valor 1 y valor 2 de division");
    valor1 = in.nextInt();
    valor2= in.nextInt();
    
    resultado=valor1/valor2;
    
    System.out.print("Division: "+resultado);
    }catch (Exception e){  //capturar, el objeto de la clase Exception para obtener el error en especifico, con el nombre del objeto usualmenete "e" o "er"
        // dentro de el identado del catch va lo que se hara si llega a pasar un error
        System.out.println("Error!!! "+e);  //se puede concatenar el nombre del error con el nombre asignado
    }finally {   //Siempre se ejecutara siempre al final
        System.out.println("Operacion Concluida");
    }
    
    }
}
