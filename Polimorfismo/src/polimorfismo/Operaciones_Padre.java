/*
El polimorfismo consiste en que un metodo tenga 
comportamientos diferentes dependiendo de con la 
clase con la que se estara comunicando
*/
package polimorfismo;
import java.util.Scanner;

public abstract class Operaciones_Padre {  //para poder utilizar el polimorfismo, hay que hacer a tu clase abstracta
    protected int valor1,valor2,resultado;
    Scanner in = new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.print("Dale el primer valor: ");
        valor1=in.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2=in.nextInt();
    }
    
    public abstract void operaciones(); //este metodo hara polimorfismo
    /*
    en una clase abstracta solamente hay que declarar 
    el metodo sin parte logica y astracto tambien
    */
    
    public void imprimir(){
        System.out.println("El resultado es: "+resultado);
    }
}