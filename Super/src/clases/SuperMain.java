
package clases;

public class SuperMain {
    public static void main(String []args){
    
        SuperH instancia = new SuperH();
        instancia.saludar();
        /*
        se ejecuta el metodo de la clase hija, 
        por que es el que se esta instanciando,
        aunque ambos se llamen igual.
        *//*
        pero para ejecutar el metodo de la clase 
        padre, hay que usar super
        */
        
    }
}
