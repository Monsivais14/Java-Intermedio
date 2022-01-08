
package clases;

public class ClaseMain {
    @public static void main(String []args){
                
        Proceso hilo1 = new Proceso(" Hilo 1");
        Proceso hilo2 = new Proceso(" Hilo 2");
        Proceso hilo3 = new Proceso(" Hilo 3");
        /*
        Hay que enviar un parametro desde el main hasta el metodo
        */
        hilo1.valor(1); //int de numero de paramtros que hara el for en su bucle de su hilo
        hilo1.start();
        hilo2.valor(2);
        hilo2.start();
        hilo3.valor(3);
        hilo3.start();
        
    }
    
}
