/*
otra manera de hacer un hilo
*/
package clases;

public class Proceso2 implements Runnable{
    
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("Proceso 2");
        }
    }
    /*
    en este solamente se implementa, el proceso 1, se hereda
    */
    
}