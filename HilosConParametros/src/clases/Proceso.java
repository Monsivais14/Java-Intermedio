
package clases;

public class Proceso extends Thread{
    int num;
    
    public Proceso(String nombre){
        super(nombre);
    }
    
    @Override
    public void run(){
        for(int i=0;i<=num;i++){
            System.out.println(i + this.getName());  //con el metodo getName(), podemos ver el nombre del hilo que se ejecuta
        }
        System.out.print("\n");
    }
    
    public void valor(int valor){
        this.num = valor;
    }
}
