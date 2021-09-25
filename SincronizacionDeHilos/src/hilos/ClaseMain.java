/*
odernar los hilos, para armar cadenas
*/
package hilos;

public class ClaseMain {
    public static void main(String []args){
        
        Hilo1 Hilo1 = new Hilo1();
        Hilo2 Hilo2 = new Hilo2();
        Hilo3 Hilo3 = new Hilo3();
        Hilo4 Hilo4 = new Hilo4();
        
        Hilo1.start();
        try{
            Hilo1.sleep(10);
        }catch(InterruptedException e){
            System.out.print("Error en 1: "+e);
        }
        Hilo2.start();
        try{
            Hilo2.sleep(10);
        }catch(InterruptedException e){
            System.out.print("Error en 2: "+e);
        }
        Hilo3.start();
        try{
            Hilo3.sleep(10);
        }catch(InterruptedException e){
            System.out.print("Error en 3: "+e);
        }
        Hilo4.start();
        try{
            Hilo4.sleep(10);
        }catch(InterruptedException e){
            System.out.print("Error en 4: "+e);
        }
    }
}
