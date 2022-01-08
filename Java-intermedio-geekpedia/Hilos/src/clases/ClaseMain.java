/*
Hilos en Java
 */
package clases;

public class ClaseMain {

    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1();  //proceso 1, con herencia Thread
        /*
        Para poder utilziar varios hilos de una misma clase, hay que darle una instancia nueva
        */
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());// proceso 2 con implementacion de Runnable
        /*
         Hay que hacer un objeto de clase Thread y 
        darle un parametro para que se comunique 
         con el constructor de la clase 
        Proceso 2, solamente con implements 
         */
        hilo1.start();//hay que llamar este metodo para que pueda funcionar
        hilo2.start();
        /*
        Hilo 3 es hilo 1 pero en una nueva instancia de una misma clase
        */
        hilo3.start();
        
    }
}
