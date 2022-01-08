/*
Hay que heredar una clase del Java
 */
package clases;

public class Proceso1 extends Thread {

    @Override
    public void run() {
        /*
        se utiliza un metodo run que ya fue heredado de la clase 
        haciendo polimorfismo.
         */
        for(int i=0;i<=5;i++){
            System.out.println("Proceso 1");
        }
    }
}
