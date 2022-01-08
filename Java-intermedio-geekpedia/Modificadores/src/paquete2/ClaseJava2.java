
package paquete2;

import paquete1.Atributos_Metodos;
        
public class ClaseJava2 {
    public static void main(String []args){
    
        
        Atributos_Metodos mensajero = new Atributos_Metodos();
        
        /*
        mensajero.valorUno;
        /*
        solamente se puede acceder a los valores 
        en su mismo package cuando tiene 
        su modificador de acceso por 
        defecto
        *//*
        Cuando es public, entra en cualquiera parte 
        aunque esten en paquetes completamente 
        diferentes
        *//*
        si el modificador de acceso, no estara disponible
        fuera de su clase, solamente se puede acceder 
        a el con los metodos getter y setter
        
        mensajero.set_v1(valor);
        System.out.println(mensajero.get_v1());
        *//*
        protected es muy parecido a el modificador por
        defecto, pero solamente permite el uso de 
        los atributos en su propio paquete, no permite 
        usarlo fuera de el.
        */
    }
}
