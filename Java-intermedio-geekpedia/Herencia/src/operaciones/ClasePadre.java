/*
Contiene los atributos y metodos qe se van a heredar a las clases hijas hijas 
Java solo tiene herencia simple.
*/
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    
    protected int valor1,valor2,resultado;
    Scanner in = new Scanner(System.in);
    
    public void pedirDatos(){     //metodo pedir datos, como no contiene main, se tiene que hacer en un metodo que depsues se heradra
        System.out.print("Dame el primer valor: ");
        valor1=in.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2=in.nextInt();
    }
    
    public void mostrarResultado(){ //no es obligatorio el encapsulamiento protected, se utilzia el que se piense utilizar
        System.out.print("El resultado es: "+ resultado);
    }
}
//metodos y productos heredados