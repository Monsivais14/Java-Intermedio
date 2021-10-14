
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author lite
 */
public class Cola {
    
    //Asignar comportamiendo de la Cola
    
    //Apuntadores o punteros Nodo
    private Nodo inicioCola;  //apunta hacia el inicio de la cola
    private Nodo finalCola;  //apunta hacia el final de la cola //permite saber el elemento al final de la cola
    
    String Cola = ""; //Permite saber cual es el contenido de la cola
    
    public Cola(){ //costructor 
        inicioCola =null;
        finalCola=null;
        
        
    }
    
    //Metodo para saber si la Cola esta vacia, es de tipo booleano
    public boolean ColaVacia(){
        if(inicioCola==null){ //si la cola esta vacia 
            return true;
        }else{ //si la cola no esta vacia
            return false;
        }
    }
    
    //Metodo que inserta a la cola
    public void Insertar(int informacion){  //insertar un valor a la cola el cuyal se pasa como parametro a recibgir e insertar en un nodo
        Nodo nuevoNodo =  new Nodo(); //nuevo nodo de la clase Nodo en este proyecto
        nuevoNodo.informacion = informacion;  //guardara el valor pasado por parametro al metodo y lo guardara en .informacion de la clase nodo
        nuevoNodo.siguiente = null; //como es el ultimo en la losta no tiene hacia donde apuntar por eso valor null
        
        if(ColaVacia()){  //true o false, es boleadno, si la cola esta vacia:
            /*
            Si la cola esta vacia, inicio cola y final cola seran igual a mi nuevoNOdo insertado anteriormente
            */
            inicioCola = nuevoNodo; 
            finalCola = nuevoNodo;
        }else{ //de lo contrario
            /*
            pero si mi cola no esta vacia, solamente el nuevo nodo insertado sera mi nuevo apunatdor 
            */
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;  //apuntador a el final de la cola
        }
        
      
    }
    
    //Metodo para extraer de la cola
    public int Extraer(){
        if(!ColaVacia()){  //si la cola NO esta vacia:
            /*
            
            */
            int informacion = inicioCola.informacion; //guardar el valor que este en el campo informacion de inicio de la cola
            if(inicioCola==finalCola){ //verifica que lo que este en el final de la cola sea lo mismo que esta ene l inicio
                inicioCola = null;     //eso quiere decir que si ambos son iguales es el ultimo valor en estar dentro de ;a cola
                finalCola = null;
            }else{
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        }else{
           return Integer.MAX_VALUE; 
        }
    }
    
    //metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        
        Nodo recorrido = inicioCola;//apoya como apuntador
        String colaInvertida = "";
        
        while(recorrido != null){
            Cola += recorrido.informacion+" ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena [] = Cola.split(" "); //invertir lo que tenga la variable cola y que se guarde en el vector cola
        //10 20 30
        
        for(int i=cadena.length-1;i>=0;i--){
            colaInvertida += " "+cadena[i]; // valor+espacio" "
            
        }
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = "";
    }
}
