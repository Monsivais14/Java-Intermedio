package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author lite
 */
public class ClaseMain {

    public static void main(String[] args) {
        int opcion = 0, nodo_informacion = 0;

        Cola cola = new Cola();

        while (true) {  //menu ciclo
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, //opcion
                        "Menu de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la cola\n"
                        + "4. Salir\n\n"
                ));

                switch (opcion) {
                    
                    
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingresa el valor a guardar en el nodo."));
                        cola.Insertar(nodo_informacion);
                        break;
                        
                    case 2:
                        if(!cola.ColaVacia()){
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valoir: "+cola.Extraer());
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 3:
                        cola.MostrarContenido();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Esa opcion no esta disponible ");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        }
    }
}
