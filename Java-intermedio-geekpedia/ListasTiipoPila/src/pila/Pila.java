/*
comportamiento de la pila
*/
package pila;

import javax.swing.JOptionPane;


public class Pila {
    
    private Nodo ultimoValor;
    int tamano;
    String lista;
    
    public Pila(){
        ultimoValor = null;
        tamano = 0;
    }
    
    //conocer si esta vacia la pila
    public boolean PilaVacia(){
        return ultimoValor==null;
    }
    //insertar nodo
    public void InsertarNodo(int nodo){
        Nodo NuevoNodo = new Nodo (nodo);
        NuevoNodo.siguiente= ultimoValor;
        ultimoValor = NuevoNodo;
        tamano++;
    }
    //eliminar nodo
    public int EliminarNodo(){
        int aux = ultimoValor.info;
        ultimoValor = ultimoValor.siguiente;
        tamano--;
        return aux;
    }
    //concer el ultimo metodo
    public int MostrarUltimo(){
        return ultimoValor.info;
    }
    //tamano de la pila 
    public int tamanopila(){
        return tamano;
    }
    public void Vaciado(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    //Mostrar contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = ultimoValor;
        
        while(recorrido != null){
            lista += recorrido.info+"\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}
