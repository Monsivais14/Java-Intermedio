
package clases;

public class SuperH extends SuperP {
    /*
    SIn utilizar Override, por que no queremos hacer polimorfismo
    */
    public void saludar(){
        System.out.println("Hola 2");
        super.saludar();
        /*
        Con el super, se puede ejecutar el metodo de la clase padre.
        */
    }
}
