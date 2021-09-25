
package clases;

public class HiloProceso extends Thread{
    
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(i+" "+getName());
            try{
            HiloProceso.sleep(1000);  //definir cuanto tiempo se pause en cada accion que hara el programa
            }catch(InterruptedException e){
                System.out.println("Error dentro de la clase: "+ e);
            }
        }
    }
}
