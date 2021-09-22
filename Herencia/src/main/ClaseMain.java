/*
Clase con el metodo Main
*/
package main;
import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;
/*
Como los metodos y variables de la clase
padre no se importa, se importa a las 
clases hijas, por que ademas de que ya 
heredo lo de la clase padre, tienen sus 
metodos propios.
*/

public class ClaseMain {
    public static void main(String []args){
        
        
       ClaseHija_Resta resta = new ClaseHija_Resta();
       ClaseHija_Suma suma = new ClaseHija_Suma();
       /*
       Hay que crear los objetos de las clases hijas
       */
       
      resta.pedirDatos();
      resta.resta();
      resta.mostrarResultado();
      /*
      los metodos creados en la clase padre tambien estan
      en ambas clases hijas
      */
      suma.pedirDatos();
      suma.sumar();
      suma.mostrarResultado();
    }
}