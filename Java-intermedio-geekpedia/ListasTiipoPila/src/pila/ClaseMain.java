
package pila;

import javax.swing.JOptionPane;

public class ClaseMain {

    public static void main(String []args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. ¿Cuál es el último valor ingresado en la pila?\n"
                        + "5. ¿Cuántos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Salir.\n\n"));
                
                switch(opcion){
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null,"Se ha eliminado el ultimo nodo con el valor "
                                    +pila.EliminarNodo());
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay valor a eliminar");
                        }
                        break;
                    case 3: 
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila contiene informacion");
                        }
                        break;
                    case 4: 
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null,"El ultomo valor de la pila es"
                                    + pila.MostrarUltimo());
                        }else{
                            JOptionPane.showMessageDialog(null,"No existe ultimo valor, la pila esra vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"La pila contiene "+pila.tamano+" nodos");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.Vaciado();
                            JOptionPane.showMessageDialog(null,"Se ha vaciado la pila");
                        }else{
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        
                        break;
                    case 7: 
                        pila.MostrarValores();
                        break;
                    case 8: 
                        opcion = 8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta, vuelve a intentar nuevamente");
                        break;
                }
                
                
            }catch(NumberFormatException e){
                
            }
        }while(opcion != 0);
    }
}