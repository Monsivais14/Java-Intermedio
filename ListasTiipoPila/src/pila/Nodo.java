/*
Creaccion de nodos
*/
package pila;

public class Nodo {
    
    int info;
    Nodo siguiente;
    
    public Nodo(int valor){
        info = valor;
        siguiente = null;
    }
}
